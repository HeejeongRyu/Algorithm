import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver_5_1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char [] arr = br.readLine().toCharArray();


		Arrays.sort(arr);


		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
		}

	}

}
