import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_5_7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int [][] arr = new int [t][2];
		StringTokenizer st;
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		for (int i = 0; i < t; i++) {
			
			
			int rank = 1;
			
			for (int j = 0; j < t; j++) {
				
				if(i==j) continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1]< arr[j][1])	{
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
		
		
		
	}

}
