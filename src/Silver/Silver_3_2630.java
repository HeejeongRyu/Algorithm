package Algorithm_2022_02_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_2630 {

	static int wh = 0;
	static int bl = 0;
	static int [][] board;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		board = new int [n][n];
		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		part(0,0,n);

		System.out.println(wh);
		System.out.println(bl);
	}

	static void part(int row, int col, int size)	{

		if(check(row,col,size))	{
			if(board[row][col]==0)	{
				wh++;
			}
			else	{
				bl++;
			}
			return;
		}
		int newsize = size / 2;
		part(row, col, newsize);
		part(row, col+newsize, newsize);
		part(row+newsize, col, newsize);
		part(row+newsize, col+newsize, newsize);
	}

	static boolean check(int row, int col, int size)	{

		int  color = board[row][col];

		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {

				if(board[i][j]!=color) {
					return false;
				}
			}
		}
		return true;
	}
}