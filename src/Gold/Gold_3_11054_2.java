package Algorithm_2022_04_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_3_11054_2 {

	static Integer [] r_dp;
	static Integer [] l_dp;
	static int [] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		r_dp = new Integer[n];
		l_dp = new Integer[n];
		arr = new int [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			LIS(i);
			LDS(i);
		}

		int max = -1;

		for (int i = 0; i < n; i++) {
			max = Math.max(r_dp[i]+l_dp[i], max);
		}

		System.out.println(max-1);
	}
	//(LIS 순방향)
	static int LIS(int n)	{

		if(r_dp[n]==null)	{
			r_dp[n] = 1;

			for (int i = n-1; i >= 0; i--) {

				if(arr[i]<arr[n])	{
					r_dp[n] = Math.max(r_dp[n], LIS(i)+1);
				}
			}
		}
		return r_dp[n];
	}

	//(LDS 역방향)
	static int LDS(int n)	{
		if(l_dp[n]==null)	{
			l_dp[n]=1;

			for (int i = n+1; i < l_dp.length; i++) {

				if(arr[i]<arr[n])	{
					l_dp[n] = Math.max(l_dp[n], LDS(i)+1);
				}
			}
		}
		return l_dp[n];
	}

}
