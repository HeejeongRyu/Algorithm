import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_11053 {

	static Integer [] dp;
	static int [] arr;
	static int n;


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		dp = new Integer [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");


		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			check(i);
		}

		int max = dp[0];

		for (int i = 1; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);

	}

	static int  check(int k)	{

		if(dp[k]==null)	{
			dp[k]=1;

			for (int i = k-1; i >=0; i--) {
				if(arr[i] < arr[k])	{

					dp[k] = Math.max(dp[k], check(i)+1);
				}
			}
		}

		return dp[k];
	}
}
