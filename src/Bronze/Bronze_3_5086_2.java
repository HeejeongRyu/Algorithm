package Algorithm_2022_04_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_3_5086_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while(true)	{
			st = new StringTokenizer(br.readLine()," ");

			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());

			if(one==0 && two==0)	break;

			if(one % two ==0)	sb.append("multiple").append('\n');
			else if(two % one ==0)	sb.append("factor").append('\n');
			else	sb.append("neither").append('\n');

		}

		System.out.println(sb);
	}

}
