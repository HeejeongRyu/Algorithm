package Algorithm_2022_02_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_3_5086_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true)	{
			st = new StringTokenizer(br.readLine()," ");

			int a1 = Integer.parseInt(st.nextToken());
			int a2 = Integer.parseInt(st.nextToken());

			if(a1*a2 ==0) break;

			if(a1%a2==0) sb.append("multiple").append('\n');
			else if(a2%a1==0) sb.append("factor").append('\n');
			else	sb.append("neither").append('\n');

		}

		System.out.println(sb);

	}



}
