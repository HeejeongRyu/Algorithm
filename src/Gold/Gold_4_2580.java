import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_4_2580 {

	public static int [][] arr = new int [9][9];


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		sudo(0,0);

	}

	public static void sudo(int n, int m)	{

		if(m==9)	{
			sudo(n+1,0);
			return;

		}

		if(n==9)	{
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}

			System.out.println(sb);
			System.exit(0);
		}

		if(arr[n][m]==0)	{
			for (int i = 1; i <=9; i++) {
				if(ret(n,m,i))	{
					arr[n][m] =i;
					sudo(n,m+1);
				}
			}

			arr[n][m]=0;
			return;
		}

		sudo(n,m+1);
	}

	public static boolean ret(int n, int m, int val)	{

		for (int i = 0; i < 9; i++) {
			if(arr[n][i]==val)	{
				return false;
			}
		}	

		for (int i = 0; i < 9; i++) {
			if(arr[i][m]==val)	{
				return false;
			}
		}	

		int subn = (n/3) * 3;
		int subm = (m/3) * 3;

		for (int i = subn; i < subn+3; i++) {
			for (int j = subm; j < subm+3; j++) {
				if(arr[i][j]==val)	{
					return false;
				}
			}
		}



		return true;
	}
}
