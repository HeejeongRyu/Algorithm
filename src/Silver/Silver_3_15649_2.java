package Algorithm_2022_04_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_15649_2 {

	static int n;
	static int m;
	static int [] arr;
	static boolean [] visit;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		n = Integer.parseInt(st.nextToken()); //3 ¼ö 
		m = Integer.parseInt(st.nextToken()); //2 ±æÀÌ

		arr = new int [m];
		visit = new boolean [n];


		dfs(0);
		System.out.println(sb);
	}

	static void dfs(int dep)	{

		if(dep==m)	{
			for(int v : arr)	{
				sb.append(v).append(" ");
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < n; i++) {
			if(!visit[i])	{
				visit[i] = true;
				arr[dep] = i+1;
				dfs(dep+1);
				visit[i] = false;
			}
		}
	}

}
