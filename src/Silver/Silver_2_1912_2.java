package Algorithm_2022_04_05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_1912_2 {


	static int [] arr;
	static Integer [] dp;
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int[n];
		dp = new Integer[n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = arr[0];
		int max = dp[0];

		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);

			max = Math.max(max, dp[i]);
		}

		System.out.println(max);

	}

}
