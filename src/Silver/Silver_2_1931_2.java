package Algorithm_2022_04_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Silver_2_1931_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int [][] arr = new int [n][2];
		StringTokenizer st;
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine()," ");

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}


		Arrays.sort(arr, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				if(o1[1]==o2[1])	{
					return o1[0] - o2[0];
				}
				return o1[1]-o2[1];
			}
		});

		int cnt = 0;
		int prev = 0;


		for (int i = 0; i < n; i++) {

			if(prev <= arr[i][0])	{
				prev = arr[i][1];
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}
