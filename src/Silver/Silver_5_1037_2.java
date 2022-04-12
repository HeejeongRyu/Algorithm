package Algorithm_2022_04_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_5_1037_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int max = -1;
		int min = 1000001;

		while(n-->0)	{

			int k = Integer.parseInt(st.nextToken());

			max = k > max ? k : max;
			min = k < min ? k : min;

		}

		System.out.println(max * min);
	}

}
