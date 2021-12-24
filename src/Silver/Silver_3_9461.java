import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_3_9461 {

	public static Long [] arr = new Long [101];

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		arr[0] = 0L;
		arr[1] = 1L;
		arr[2] = 1L;
		arr[3] = 1L;
		arr[4] = 2L;
		arr[5] = 2L;

		int t = Integer.parseInt(br.readLine());

		while(t-->0)	{
			sb.append(pado(Integer.parseInt(br.readLine()))).append('\n');

		}
		System.out.println(sb);
	}

	public static long pado(int t) {
		if(arr[t]==null)	{
			arr[t] = pado(t-2) + pado(t-3);
		}
		return arr[t];
	}



}