package Algorithm_2022_01_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver_5_2609 {

	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int [] arr = new int [2];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);

		int d = gcd(arr[0],arr[1]);

		System.out.println(d);
		System.out.println(arr[0]*arr[1] / d);

	}

	static int gcd(int a, int b)	{
		if(b==0) return a;
		return gcd(b, a%b);
	}

	static int lcm(int a, int b)	{
		return a * b / gcd(a,b);
	}

}
