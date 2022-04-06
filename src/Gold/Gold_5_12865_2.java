package Algorithm_2022_04_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_5_12865_2 {

	static int [] v;
	static int [] w;
	static int [][]dp;
	static int n;
	static int k;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		v = new int[n+1];
		w = new int[n+1];
		dp = new int[n+1][k+1];

		for (int i = 1; i <=n; i++) {
			st = new StringTokenizer(br.readLine()," ");

			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= k; j++) {

				if(w[i]>j)	{
					dp[i][j] = dp[i-1][j];
				}
				else	{
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
				}
			}

		}
		System.out.println(dp[n][k]);
	}

}
