package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2231_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int res = 0;

		for (int i = 0; i < n; i++) {
			int num = i;
			int sum = 0;

			while(num != 0)	{
				sum += num % 10;
				num /= 10;
			}

			if(sum +i ==n)	{
				res =i;
				break;
			}
		}

		System.out.println(res);
	}

}
