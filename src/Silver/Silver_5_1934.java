package Algorithm_2022_01_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_5_1934 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		while(t-->0)	{
			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = gcd(a,b);

			sb.append(a*b/c).append('\n');

		}

		System.out.println(sb);
	}

	static int gcd(int a, int b)	{
		if(b==0) return a;
		return gcd(b, a%b);
	}

}
