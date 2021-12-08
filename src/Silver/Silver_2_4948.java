package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_2_4948 {


	public static boolean[] prime = new boolean[246913];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



		getprime();

		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;	// n 이 0 일경우 종료

			int count = 0;	// 소수 개수를 셀 변수

			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime[i]) count++;
			}
			System.out.println(count);
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