package Algorithm_2022_03_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold_5_9663_1 {
	
	static int [] arr;
	static int n;
	static int cnt = 0;
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		nq(0);
		System.out.println(cnt);
	}
	
	static void nq(int dep)	{
		if(dep==n)	{
			cnt++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[dep] = i;
			
			if(possibility(dep))	{
				nq(dep+1);
			}
		}
	}
	
	static boolean possibility(int col)	{
		
		for (int i = 0; i < col; i++) {
			if(arr[col]==arr[i])	{
				return false;
			}
			
			else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i]))	{
				return false;
			}
		}
		return true;
	}

}
