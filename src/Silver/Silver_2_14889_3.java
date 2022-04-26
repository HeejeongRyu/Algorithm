package Algorithm_2022_04_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_14889_3 {


	static int [][] arr;
	static boolean [] visit;
	static int n;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int [n][n];
		visit = new boolean [n];

		StringTokenizer  st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");

			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		com(0,0);
		System.out.println(min);
	}

	static void com(int index, int cnt)	{

		if(cnt==n/2)	{
			diff();
			return;
		}

		for (int i = index; i < n; i++) {
			if(!visit[i])	{
				visit[i] = true;
				com(i+1,cnt+1);
				visit[i] = false;
			}
		}
	}

	static void diff()	{
		int tstart = 0;
		int tlink = 0;

		for (int i = 0; i < n-1; i++) {

			for (int j = i+1; j < n; j++) {

				if(visit[i]==true && visit[j]==true)	{
					tstart += arr[i][j];
					tstart += arr[j][i];
				}

				else if(visit[i]==false && visit[j]==false)	{
					tlink += arr[i][j];
					tlink += arr[j][i];
				}
			}
		}

		int v = Math.abs(tstart-tlink);

		if(v==0)	{
			System.out.println(v);
			System.exit(0);
		}

		min = Math.min(v,min);
	}

}
