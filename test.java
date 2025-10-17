@Override
public Mono<List<MemberModelWithId>> groupCacheEmailAddressMemberModelWithIdList(
    String scopeId,
    String groupId
) {

    final Flux<ClientMember> fluxClientMembers =
        scopeCacheService.scopeCacheFluxClientMembers(scopeId);

    final Mono<HashMap<String, FindMemberDetailsDto.Response.Body>> scopeFetchAllFindMemberMap =
        scopeCacheService.scopeCacheFetchAllFindMemberMap(scopeId);

    final Mono<HashMap<String, FindMemberDetailsDto.Response.Body>> scopeFetchAllFindDummyMemberMap =
        scopeCacheService.scopeCacheFetchAllFindDummyMemberMap(scopeId);

    final Mono<HashMap<String, FindMemberDetailsDto.Response.Body>> groupFetchAllFindGuestMemberMap =
        groupCacheFetchAllFindGuestMemberMap(scopeId, groupId);

    // 3개 맵 머지
    Mono<HashMap<String, FindMemberDetailsDto.Response.Body>> monoMergedFetchAllFindMemberMap =
        Flux.concat(
                scopeFetchAllFindMemberMap,
                scopeFetchAllFindDummyMemberMap,
                groupFetchAllFindGuestMemberMap
        )
        .reduce(new HashMap<>(), (acc, cur) -> {
            acc.putAll(cur);
            return acc;
        });

    // 머지 맵 + clientMembers -> MemberModelWithId 스트림
    Flux<MemberModelWithId> fluxMemberModelWithIds =
        monoMergedFetchAllFindMemberMap.flatMapMany(merged -> 
            fluxClientMembers
                .filter(cm -> merged.containsKey(cm.getPersonCode()))
                .map(cm -> MemberModelWithId.withId(
                        merged.get(cm.getPersonCode()).getMemberId(),
                        MemberModel.from(cm, null, null, null, null)
                ))
        );

    // ⬇️ 첫 번째 run() 전부 제거. 바로 두 번째 run()의 요청 튜플을 생성
    Flux<Tuple2<MemberModelWithId, FindMemberEmailAddressListDto.Request>>
    fluxFindMemberEmailAddressListRequestTuple =
        fluxMemberModelWithIds.flatMap(m -> {
            FindMemberEmailAddressListDto.Request req =
                FindMemberEmailAddressListDto.Request.from(
                    m.getMemberId(),
                    m.getModel().getIdProviderUserId(),
                    FindMemberEmailAddressListDto.Request.Params.builder()
                        .page(0)
                        .size(20)
                        .build()
                );
            return Flux.just(Tuples.of(m, req));
        });

    // 두 번째 배치에서 사용할 컨버터는 그대로 유지
    Function<Tuple2<MemberModelWithId, FindMemberEmailAddressListDto.Request>, Mono<MemberModelWithId>>
    convertMemberEmailAddressList = tuple ->
        memberEmailAddressService.findMemberEmailAddressList(tuple.getT2())
            .mapNotNull(ResponseDto::getResult)
            .map(res -> {
                List<FindMemberEmailAddressDetailsDto.Response.Body> emailList =
                    res.getBody().stream().toList();

                return emailList.isEmpty()
                    ? tuple.getT1().withAddEmailSequenceType()
                    : tuple.getT1().withChangeEmailSequenceType(
                        emailList.stream()
                                 .map(FindMemberEmailAddressDetailsDto.Response.Body::getEmailAddress)
                                 .toList()
                      );
            });

    // 두 번째 run()만 실행
    final Mono<List<MemberModelWithId>> source =
        batchProcessorRunner("FIND MEMBER EMAIL ADDRESS LIST", convertMemberEmailAddressList)
            .run(fluxFindMemberEmailAddressListRequestTuple)
            .collectList();

    // 캐시 래핑 + 로깅
    return Mono.deferContextual(ctx ->
                getOrLoad(
                    CacheKeys.EMAIL_ADDRESS_MEMBER_MODEL_WITH_ID_LIST_KEY(scopeId, groupId),
                    source,
                    "EMAIL ADDRESS MEMBER MODEL WITH ID LIST"
                )
           )
           .doOnSubscribe(_x -> log.debug("start"))
           .doOnNext(r -> log.debug("size {}", r.size()))
           .doOnError(e -> log.error("err {}", e.getMessage(), e))
           .doFinally(_x -> log.debug("end"));
}
