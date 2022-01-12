import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Silver_3_11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int [n];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr);
		
		
		int prev = 0;
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += prev + arr[i];
			
			prev += arr[i];
		}
		
		System.out.println(sum);
	}

}
