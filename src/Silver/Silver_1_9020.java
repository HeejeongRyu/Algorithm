package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1_9020 {

	static boolean [] prime = new boolean [10001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		getprime();

		int a = Integer.parseInt(br.readLine());

		while(a-->0)	{

			int b = Integer.parseInt(br.readLine());
			int p = b/2;
			int q = b/2;

			while(true)	{
				if(prime[p]==false && prime[q]==false)	{
					System.out.println(p+" " +q);
					break;
				}
				p--;
				q++;
			}

		}

	}


	static void getprime()	{

		prime[0]=prime[1]=true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for (int j = i*i; j < prime.length; j+=i) {
				prime[j]=true;
			}
		}
	}
}