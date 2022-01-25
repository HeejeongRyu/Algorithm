package Algorithm_2022_01_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold_5_2981 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int [] arr = new int [n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();

		int val = arr[1]-arr[0];

		for (int i = 2; i < n; i++) {
			val = gcd(val, arr[i]-arr[i-1]);
		}

		for (int i = 2; i <= val/2; i++) {
			if(val%i==0)	{
				sb.append(i+" ");
			}
		}

		sb.append(val);

		System.out.println(sb);
	}

	static int gcd(int a, int b)	{
		if(b==0)	return a;
		return gcd(b,  a%b);
	}

}
