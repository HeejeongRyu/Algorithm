package Algorithm_2022_03_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Silver_3_9461_2 {

	static long [] arr = new long [101];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;

		check();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			sb.append(arr[Integer.parseInt(br.readLine())]).append('\n');
		}

		System.out.println(sb);

	}

	static void check()	{
		for (int i = 4; i < 101; i++) {
			arr[i] = arr[i-2]+arr[i-3];
		}
	}

}
