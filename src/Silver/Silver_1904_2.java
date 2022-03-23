package Algorithm_2022_03_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1904_2 {

	static int [] dp = new int [1000001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		dp[0]=0;
		dp[1]=1;
		dp[2]=2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n= Integer.parseInt(br.readLine());

		for (int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}

		System.out.println(check(n));


	}

	static int check(int n)	{

		if(dp[n]==-1) {
			dp[n] = (check(n-1)+check(n-2)) %15746;
		}
		return dp[n];
	}

}
