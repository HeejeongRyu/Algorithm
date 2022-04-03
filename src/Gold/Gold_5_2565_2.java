package Algorithm_2022_04_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Gold_5_2565_2 {
	//방문 여부를 편하게 판단하기 위해 Integer 객체 배열로 선언했다.
	static Integer dp [];
	static int arr [][];
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		dp = new Integer [n];
		arr = new int [n][2];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}


		Arrays.sort(arr, new Comparator<int[]>(){

			@Override
			public int compare(int[]o1, int[]o2)	{
				return o1[0]-o2[0];
			}

		});

		int max = 0;

		for (int i = 0; i < n; i++) {
			max = Math.max(recur(i), max);
		}

		System.out.println(n-max);

	}

	static int recur(int n)	{
		if(dp[n]==null)	{

			dp[n] = 1;

			for (int i = n+1; i < dp.length; i++) {

				if(arr[n][1]<arr[i][1])	{
					dp[n] = Math.max(dp[n], recur(i)+1);
				}
			}
		}
		return dp[n];
	}

}
/*
 * 전체전선 개수 = 설치가능개수 + 철거개수
 * 철거개수 = 전체전선 - 설치가능개수
 * recur method 설명
 * a전봇대의 n번째 전선이 연결되어있는 b전봇대보다 a의i번째 전봇대의 전선이 이어진 b전봇대가 뒤에 있는경우
 * 겹치지 않기 때문에 설치를 할 수가 있다.
 * 
 * 2차원 배열을 정렬해 주는 것이 없으므로 comparator을 이용하여 정리한다.
 * 
 */
