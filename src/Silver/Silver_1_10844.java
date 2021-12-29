import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1_10844 {

	static Long [][] dp;
	static int n;
	final static long mid = 1000000000;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		dp = new Long[n+1][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}

		long result = 0;

		for (int i = 1; i < 10; i++) {
			result += recur(n,i);
		}

		System.out.println(result % mid);
	}


	static long recur(int dig, int val)	{

		if(dig==1)	{
			return dp[dig][val];
		}

		if(dp[dig][val]==null)	{

			if(val==0)	{
				dp[dig][val] = recur(dig-1,1);
			}

			else if(val==9)	{
				dp[dig][val] = recur(dig-1,8);
			}

			else	{
				dp[dig][val] = recur(dig-1,val-1) + recur(dig-1, val+1);
			}

		}
		return dp[dig][val] % mid;
	}

}
