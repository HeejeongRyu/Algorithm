import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Gold_5_2565 {

	static int [][] arr;
	static Integer [] dp;
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int [n][2];
		dp = new Integer[n];

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
		});

		int max = 0;

		for (int i = 0; i < n; i++) {
			max = Math.max(recur(i), max);
		}

		System.out.println(n-max);


	}

	static int recur(int n)	{
		dp[n]=1;

		for (int i = n+1; i < dp.length; i++) {

			if(arr[n][1]<arr[i][1])	{
				dp[n] = Math.max(dp[n], recur(i)+1);
			}
		}
		return dp[n];
	}

}
