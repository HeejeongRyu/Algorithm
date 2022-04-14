package Algorithm_2022_04_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold_5_2981_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int gcdval = arr[1] - arr[0];
		
		for (int i = 2; i < n; i++) {
			gcdval = gcd(gcdval, arr[i]-arr[i-1]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 2; i <= gcdval/2; i++) {
			if(gcdval%i==0)	sb.append(i).append(' ');
		}
		sb.append(gcdval);
		
		System.out.println(sb);
	}
	
	static int gcd(int a, int b)	{
		
		while(b!=0)	{
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
