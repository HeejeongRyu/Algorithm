import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1_1149 {
	
	final static int red = 0;
	final static int green = 1;
	final static int blue = 2;
	

	static int [][] cost;
	static int [][] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		cost = new int [n][3];
		dp = new int [n][3];
		
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			cost[i][red] = Integer.parseInt(st.nextToken());
			cost[i][green] = Integer.parseInt(st.nextToken());
			cost[i][blue] = Integer.parseInt(st.nextToken());
			
		}
		
		dp[0][red] = cost[0][red];
		dp[0][green] = cost[0][green];
		dp[0][blue] = cost[0][blue];
		
		System.out.println(Math.min(paint(n-1, red), Math.min(paint(n-1, green), paint(n-1, blue))));
	}
	
	static int paint(int n , int color)	{
		if(dp[n][color]==0)	{
			if(color ==red)	{
				dp[n][red] = Math.min(paint(n-1, green), paint(n-1, blue)) + cost[n][red];
			}
			else if(color ==green)	{
				dp[n][green] = Math.min(paint(n-1, red), paint(n-1, blue)) + cost[n][green];
			}
			else	{
				dp[n][blue] = Math.min(paint(n-1, green), paint(n-1, red)) + cost[n][blue];
			}
		}
		return dp[n][color];
	}

}
