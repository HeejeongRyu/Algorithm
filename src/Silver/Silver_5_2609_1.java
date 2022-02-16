package Algorithm_2022_02_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver_5_2609_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int [] arr = new int [2];
		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		int a = check(arr[0],arr[1]);


		System.out.println(a);
		System.out.println(arr[0]*arr[1]/a);

	}

	static int check (int a, int b)	{
		if(b==0) return a;
		return check(b, a%b);
	}

}
