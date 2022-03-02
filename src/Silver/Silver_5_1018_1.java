package Algorithm_2022_03_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_5_1018_1 {

	public static boolean [][] arr;
	public static int min = 64;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int m = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(st.nextToken());

		arr = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			String name = br.readLine();

			for (int j = 0; j < name.length(); j++) {
				if(name.charAt(j)=='W') arr[i][j] = true;
				else arr[i][j] = false;
			}
		}


		
		int m_row = m-7;
		int n_col = n-7;
		
		for (int i = 0; i < m_row; i++) {
			for (int j = 0; j < n_col; j++) {
				find(i,j);
			}
		}
		System.out.println(min);



	}
	
	
	static void find(int x, int y)	{
		int endx = x+8;
		int endy = y+8;
		int cnt = 0;
		
		boolean tf = arr[x][y];
		
		for (int i = x; i < endx; i++) {
			for (int j = y; j < endy; j++) {
				
				
				if(arr[i][j]!=tf)	{
					cnt++;
				}
				tf =(!tf);
			}
			tf = !tf;
		}
		
		cnt = Math.min(cnt, 64-cnt);
		
		min = Math.min(min, cnt);
		
	}

}
