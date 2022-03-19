package Algorithm_2022_03_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_4_2580_1 {

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

		sudoku(0,0);
	}

	static void sudoku(int row, int col)	{

		//행다채워지면 다음행으로
		if(col==9)	{
			sudoku(row+1,0);
			return;
		}
		//행열 다채워지면 출력
		if(row==9) {
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

		//해당위치 값이 0이면 1-9가능한 수 탐색
		if(arr[row][col]==0)	{
			for (int i = 1; i <=9; i++) {
				if(possibility(row, col, i))	{
					arr[row][col] = i;
					sudoku(row,col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sudoku(row, col+1);

	}

	static boolean possibility(int row, int col, int value)	{
		//같은행 검사
		for (int i = 0; i < 9; i++) {
			if(arr[row][i] == value)	{
				return false;
			}
		}
		//같은열 검사
		for (int i = 0; i < 9; i++) {
			if(arr[i][col] == value)	{
				return false;
			}
		}

		//3*3칸 검사
		int srow = (row/3) *3;
		int scol = (col/3) *3;

		for (int i = srow; i < srow+3; i++) {
			for (int j = scol; j < scol+3; j++) {
				if(arr[i][j]==value)	{
					return false;
				}
			}
		}

		return true;
	}




}
