package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bronze_3_4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		while(true)	{
			st = new StringTokenizer(br.readLine()," ");

			int [] arr = new int [3];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);
			if(arr[0]==0) break;

			if(Math.pow(arr[2], 2)==(Math.pow(arr[1], 2)+Math.pow(arr[0], 2)))	{
				System.out.println("right");
			}
			else	{
				System.out.println("wrong");
			}

		}
	}

}
