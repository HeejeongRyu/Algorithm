package Algorithm_2022_03_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1_1149_2 {

	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;

	static int[][] Cost;
	static int[][] DP;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Cost = new int [n][3];
		DP = new int [n][3];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");

			Cost[i][Red] = Integer.parseInt(st.nextToken());
			Cost[i][Green] = Integer.parseInt(st.nextToken());
			Cost[i][Blue] = Integer.parseInt(st.nextToken());
		}
		DP[0][Red] = Cost[0][Red];
		DP[0][Green] = Cost[0][Green];
		DP[0][Blue] = Cost[0][Blue];

		System.out.println(Math.min(check(n-1,Red), Math.min(check(n-1,Green),check(n-1,Blue))));		

	}

	static int check(int n, int color)	{

		if(DP[n][color]==0)	{
			if(color == Red) {
				DP[n][Red] = Math.min(check(n - 1, Green), check(n - 1, Blue)) + Cost[n][Red];
			}
			else if(color == Green) {
				DP[n][Green] = Math.min(check(n - 1, Red), check(n - 1, Blue)) + Cost[n][Green];
			}
			else {
				DP[n][Blue] = Math.min(check(n - 1, Red), check(n - 1, Green)) + Cost[n][Blue];
			}
		}

		return DP[n][color];
	}

}
