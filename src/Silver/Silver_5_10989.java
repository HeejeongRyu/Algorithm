import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class Silver_5_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int [] arr = new int [t];

		for (int i = 0; i <t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			sb.append(arr[i]).append('\n');
		}

		System.out.println(sb);
	}

}
