import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_3_1904 {

	static int n;
	static Integer [] arr = new Integer[1000001];


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());


		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		System.out.println(tile(n));


	}

	static int tile(int n) {	
		if(arr[n]==null)	{
			arr[n] = (tile(n-1) + tile(n-2)) % 15746;
		}
		return arr[n];
	}
}
