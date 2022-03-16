package Algorithm_2022_03_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_15651_1 {

	static int [] arr;
	static int n,m;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[m];

		dfs(0);
		System.out.println(sb);
	}


	static void dfs(int depth)	{
		if(depth == m)	{
			for(int val:arr)	{
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}

	}

}
