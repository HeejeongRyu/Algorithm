import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Silver_5_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < t; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(list);

		for (int v : list) {
			sb.append(v).append('\n');
		}

		System.out.println(sb);


	}

}
