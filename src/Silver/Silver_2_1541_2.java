package Algorithm_2022_04_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_1541_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = Integer.MAX_VALUE;

		StringTokenizer st1 = new StringTokenizer(br.readLine(),"-");


		while(st1.hasMoreTokens()) {
			int tmp = 0;

			StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"+");

			while(st2.hasMoreTokens())	{

				tmp += Integer.parseInt(st2.nextToken());
			}

			if(sum == Integer.MAX_VALUE)	{
				sum = tmp;
			}
			else	{
				sum -= tmp;
			}
		}

		System.out.println(sum);
	}

}
