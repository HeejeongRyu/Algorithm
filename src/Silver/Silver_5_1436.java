package Algorithm_2022_03_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_5_1436 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int num = 666;
		int cnt = 1;

		while(cnt !=n)	{
			num++;
			if(String.valueOf(num).contains("666"))	{
				cnt++;
			}
		}

		System.out.println(num);
	}

}
