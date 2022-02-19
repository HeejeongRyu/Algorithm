package Algorithm_2022_02_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class Gold_5_2981_1 {

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

		int val = arr[1] - arr[0];

		for (int i = 2; i < n; i++) {
			val = check(val, arr[i]-arr[i-1]);
		}


		for (int i = 2; i <= val / 2; i++) {
			if(val % i ==0) {
				sb.append(i+ " ");
			}
		}

		sb.append(val);

		System.out.println(sb);


	}

	static int check(int a, int b)	{
		while(b!=0)	{
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

}
