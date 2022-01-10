import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_1912 {

	static int n;
	static Integer [] dp;
	static int [] arr;
	static int max;


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		dp = new Integer [n];
		arr = new int [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = arr[0];
		max = arr[0];

		check(n-1);

		System.out.println(max);



	}

	static int check(int n)	{

		if(dp[n]==null)	{
			dp[n] = Math.max(check(n-1)+arr[n], arr[n]);

			max = Math.max(max, dp[n]);
		}

		return dp[n];
	}

}
