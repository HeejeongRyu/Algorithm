import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_4_13305 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int [] len = new int [n-1];

		int [] price = new int [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for (int i = 0; i < len.length; i++) {
			len[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < price.length; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}


		int sum = 0;
		int min = price[0];

		for (int i = 0; i <	n-1; i++) {
			if(price[i]<min) {
				min = price[i];
			}
			sum += (min * len[i]);
		}

		System.out.println(sum);


	}

}
