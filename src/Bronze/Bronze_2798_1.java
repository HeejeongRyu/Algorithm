package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Bronze_2798_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [n];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = check(arr,n,m);
		System.out.println(res);
	}
	
	static int check(int[]arr, int n, int m)	{
		int res =0;
		
		for (int i = 0; i < n-2; i++) {
			
			for (int j = i+1; j < n-1; j++) {
				
				for (int j2 = j+1; j2 < n; j2++) {
					
					int tmp = arr[i] + arr[j] + arr[j2];
					
					if(m==tmp)	{
						return tmp;
					}
					
					if(res < tmp && tmp < m)	{
						res = tmp;
					}
				}
			}
		}
		
		return res;
	}

}
