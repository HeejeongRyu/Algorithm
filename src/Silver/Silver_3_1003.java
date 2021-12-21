import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_3_1003 {
	
	public static Integer [][] arr = new Integer[41][2];
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(t-->0)	{
			int n = Integer.parseInt(br.readLine());
			
			fibo(n);
			
			sb.append(arr[n][0]+ " "+ arr[n][1]).append('\n');
		}
		System.out.println(sb);
		
	}
	
	static Integer[] fibo(int n)	{
		if(arr[n][0]==null || arr[n][1]==null)	{
			arr[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
			arr[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
		}
		return arr[n];
	}

}
