import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1_2156 {

	static int [] arr;
	static Integer [] dp;
	static int sum = 0;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int [n+1];
		dp = new Integer [n+1];



		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dp[0]=0;
		dp[1]=arr[1];

		if(n>1) {
			dp[2]=arr[1]+arr[2];	
		}

		System.out.println(check(n));


	}

	static int check(int n)	{

		if(dp[n] == null)	{
			dp[n] = Math.max(Math.max(check(n-2), check(n-3)+arr[n-1])+arr[n], check(n-1));
		}

		return dp[n];
	}

}
