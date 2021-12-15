import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Silver_5_10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		String [][] arr = new String [t][2];
		StringTokenizer st;

		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}

		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});


		for (int i = 0; i < t; i++) {
			System.out.println(arr[i][0]+ " "+ arr[i][1]);
		}
	}

}
