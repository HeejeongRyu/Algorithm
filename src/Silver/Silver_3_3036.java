package Algorithm_2022_01_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_3036 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
	
		for (int i = 1; i < arr.length; i++) {
			
			int gcd = gcd(arr[0],arr[i]);
			
			sb.append(arr[0]/gcd).append('/').append(arr[i]/gcd).append('\n');
		}
		
		System.out.println(sb);
	}
	
	static int gcd(int a, int b)	{
		if(b==0)	return a;
		return gcd(b,a%b);
	}
	

}
