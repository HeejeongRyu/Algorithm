package Algorithm_2022_04_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_11053 {

	static int [] seq;
	static Integer [] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		seq = new int[n];
		dp = new Integer [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			lis(i);
		}

		int max = dp[0];

		for (int i = 1; i < n; i++) {
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);

	}

	static int lis(int n)	{
		if(dp[n]==null)	{
			dp[n] = 1;

			for (int i = n-1; i >= 0; i--) {
				if(seq[i]<seq[n])	{
					dp[n] = Math.max(dp[n], lis(i)+1);
				}
			}
		}
		return dp[n];
	}

}
