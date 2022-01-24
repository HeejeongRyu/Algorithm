package Algorithm_2022_01_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver_5_1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int [] arr = new int [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		if(n==1) System.out.println(Math.pow(arr[0], 2));
		else System.out.println(arr[0] * arr[n-1]);

	}

}
