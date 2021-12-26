import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1_1932 {

	static int [][] arr;
	static Integer [][] dp;
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		dp = new Integer[n][n];
		arr = new int [n][n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < i+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			dp[n-1][i] = arr[n-1][i];
		}

		System.out.println(find(0,0));
	}

	static int find (int dep, int idx)	{

		if(dep==n-1) return dp[dep][idx];

		if(dp[dep][idx]==null)	{
			dp[dep][idx] = Math.max(find(dep+1, idx), find(dep+1, idx+1)) + arr[dep][idx];
		}
		return dp[dep][idx];
	}

}
