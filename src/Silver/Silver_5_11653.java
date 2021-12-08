package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_5_11653 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		int cnt = 2;

		while(a!=1)	{

			if(a%cnt==0)	{
				a /= cnt;
				System.out.println(cnt);
			}
			else	{
				cnt++;
			}


		}
	}

}
