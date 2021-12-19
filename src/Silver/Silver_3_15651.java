import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_15651 {

	public static int [] arr;
	public static boolean [] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int n,m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());


		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());


		arr = new int[m];
		

		btk(0);
		System.out.println(sb);



	}

	public static void btk(int depth)	{

		if(depth==m)	{
			for(int val : arr)	{
				sb.append(val).append(" ");
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= n; i++) {

			arr[depth] = i;
			btk(depth+1);
		}


	}

}