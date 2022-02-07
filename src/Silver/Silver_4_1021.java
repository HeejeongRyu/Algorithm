package Algorithm_2022_02_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Silver_4_1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		LinkedList<Integer> dq = new LinkedList<Integer>();
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			dq.offer(i);
		}

		int [] sq = new int [m];

		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < m; i++) {
			sq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < m; i++) {
			int target = dq.indexOf(sq[i]);
			int half;

			if(dq.size()%2==0)	{
				half = dq.size() /2 -1;
			}
			else	{
				half = dq.size() /2;
			}

			if(target <= half)	{
				for (int j = 0; j < target; j++) {
					int temp = dq.pollFirst();
					dq.offerLast(temp);
					cnt++;
				}
			}
			else	{
				for (int j = 0; j < dq.size()-target; j++) {
					int temp = dq.pollLast();
					dq.offerFirst(temp);
					cnt++;
				}
			}
			dq.pollFirst();
		}
		System.out.println(cnt);
	}

}
