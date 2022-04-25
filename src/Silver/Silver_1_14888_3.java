package Algorithm_2022_04_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1_14888_3 {

	static int [] arr;
	static int [] operation = new int [4];
	static int n;

	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < 4; i++) {
			operation[i] = Integer.parseInt(st.nextToken());
		}



		dfs(arr[0], 1);

		System.out.println(max);
		System.out.println(min);
	}

	static void dfs(int a, int b)	{

		if(b==n)	{
			max = Math.max(a, max);
			min = Math.min(a, min);
			return;
		}

		for (int i = 0; i < 4; i++) {
			if(operation[i]>0)	{

				operation[i]--;

				switch(i)	{

				case 0 : dfs(a+arr[b], b+1);	break;
				case 1 : dfs(a-arr[b], b+1);	break;
				case 2 : dfs(a*arr[b], b+1);	break;
				case 3 : dfs(a/arr[b], b+1);	break;
				}
				operation[i]++;
			}
		}
	}

}
