package Algorithm_2022_02_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Silver_3_1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while(t-->0)	{
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			LinkedList<int[]> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}

			int cnt = 0;

			while(!q.isEmpty())	{
				int [] fnt = q.poll();
				boolean ismax =true;

				for(int i = 0; i < q.size(); i++) {

					if(fnt[1] < q.get(i)[1]) {

						q.offer(fnt);
						for(int j = 0; j < i; j++) {
							q.offer(q.poll());
						}

						ismax = false;
						break;
					}
				}

				if(ismax == false) {
					continue;
				}

				cnt++;
				if(fnt[0] == m) {	
					break;
				}

			}

			sb.append(cnt).append('\n');

		}
		System.out.println(sb);
	}

}