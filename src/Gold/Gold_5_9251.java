import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold_5_9251 {

	static char [] str1;
	static char [] str2;
	static Integer [][] dp;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str1 = br.readLine().toCharArray();
		str2 = br.readLine().toCharArray();

		dp = new Integer[str1.length][str2.length];

		System.out.println(check(str1.length-1, str2.length-1));

	}

	static int check(int x, int y)	{

		if(x==-1 || y==-1)	{
			return 0;
		}

		if(dp[x][y]==null)	{

			if(str1[x]==str2[y])	{
				dp[x][y] = check(x-1,y-1)+1;
			}

			else	{
				dp[x][y]= Math.max(check(x-1,y), check(x,y-1));
			}
		}
		return dp[x][y];
	}

}
