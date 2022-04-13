package Algorithm_2022_04_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_5_2609_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int one = Integer.parseInt(st.nextToken());
		int two = Integer.parseInt(st.nextToken());


		int d = gcd(one, two);

		System.out.println(d);
		System.out.println(one * two / d);

	}

	static int gcd(int a, int b)	{

		while(b!=0)	{
			int r = a % b;

			a = b;
			b = r;


		}
		return a;
	}

}
