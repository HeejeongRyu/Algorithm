package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Gold_4_2580_3 {

	static int [][] arr = new int [9][9];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		sudo(0,0);


	}

	static void sudo(int row, int col)	{

		if(col==9)	{
			sudo(row+1,0);
			return;
		}

		if(row==9)	{
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append('\n');
			}
			System.out.println(sb);
			System.exit(0);
		}

		if(arr[row][col]==0)	{
			for (int i = 1; i < 10; i++) {
				if(poss(row, col, i))	{
					arr[row][col] = i;
					sudo(row, col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sudo(row,col+1);
	}



	static boolean poss(int row, int col, int val)	{
		for (int j = 0; j < 9; j++) {
			if(arr[j][col]==val)	{
				return false;
			}
		}

		for (int j = 0; j < 9; j++) {
			if(arr[row][j]==val)	{
				return false;
			}
		}

		int srow = (row/3) * 3;
		int scol = (col/3) * 3;

		for (int j =srow; j < srow+3; j++) {
			for (int j2 = scol; j2 < scol+3; j2++) {
				if(arr[j][j2]==val)	{
					return false;
				}
			}
		}
		return true;
	}

}
