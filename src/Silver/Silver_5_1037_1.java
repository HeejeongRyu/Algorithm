package Algorithm_2022_01_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver_5_1037_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			max = k > max ? k :max;
			min = k < min ? k :min;
		}
		
		System.out.println(max*min);

	}

}
