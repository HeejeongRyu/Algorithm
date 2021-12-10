import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1_2447_re {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			StringBuffer sb = new StringBuffer(n);

			for (int j = 0; j < n; j++) {

				boolean x = false;

				for (int k = 1; k < n; k*=3) {

					if(i/k%3==1 && j/k%3==1) x = true;
					sb.append(x ? " " : "*");
				}
				System.out.println(sb);
			}
		}
	}

}
