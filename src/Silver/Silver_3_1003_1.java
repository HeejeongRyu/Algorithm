package Algorithm_2022_03_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_3_1003_1 {

	static Integer [][] dp = new Integer[41][2];



	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
		dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
		dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
		dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수


		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());

			check(n);
			sb.append(dp[n][0]+ " " +dp[n][1]).append('\n');
		}
		System.out.println(sb);
	}

	static Integer[] check(int n)	{
		if(dp[n][0] == null || dp[n][1] == null)	{
			dp[n][0] = check(n-1)[0] + check(n-2)[0];
			dp[n][1] = check(n-1)[1] + check(n-2)[1];
		}
		return dp[n];
	}

}
