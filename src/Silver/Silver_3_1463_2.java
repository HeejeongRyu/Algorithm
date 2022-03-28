package Algorithm_2022_03_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_3_1463_2 {

	static Integer [] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new Integer[n+1];
		dp[0] = dp[1] = 0;

		System.out.println(check(n));
	}

	static int check(int n)	{

		if(dp[n]==null)	{
			if(n%6==0)	{
				dp[n] = Math.min(check(n-1), Math.min(check(n/2), check(n/3))) + 1;
			}
			else if(n%3==0)	{
				dp[n] = Math.min(check(n/3), check(n-1)) + 1;
			}
			else if(n%2==0)	{
				dp[n] = Math.min(check(n/2), check(n-1)) + 1;
			}
			else	{
				dp[n] = check(n-1) +1;
			}
		}
		return dp[n];
	}

}
