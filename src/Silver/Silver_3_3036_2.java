package Algorithm_2022_04_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_3036_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int [] arr = new int [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i=0; i < n; i++) {

			arr[i]= Integer.parseInt(st.nextToken());

		}


		StringBuilder sb = new StringBuilder();


		for(int i=1; i<n; i++){

			int gcdval = gcd(arr[0], arr[i]);

			sb.append(arr[0] / gcdval).append('/').append(arr[i] / gcdval).append('\n');


		}


		System.out.println(sb);


	}


	static int gcd(int a, int b){
		int r;
		while(b!=0)    {

			r = a%b;

			a=b;
			b=r;

		}

		return a;

	}
}
