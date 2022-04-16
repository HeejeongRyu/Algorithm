package Algorithm_2022_04_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_1_11050_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		System.out.println(fact(n) / (fact(n-k) * fact(k)));
		
	}

	static int fact(int n)	{
		
		if(n<=1)	{
			return 1;
		}
		return n * fact(n-1);
	}
}
