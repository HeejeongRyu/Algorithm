package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2_1929 {
	
	static boolean []  prime;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		prime = new boolean [b+1];

		getprime();

		for (int i = a; i <= b; i++) {
			if(!prime[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

	static void getprime()	{

		prime[0]=prime[1]= true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for (int j = i*i; j < prime.length; j+=i) {
				prime[j] = true;
			}
		}


	}

}
