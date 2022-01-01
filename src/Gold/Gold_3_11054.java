import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_3_11054 {


	static Integer [] rdp;
	static Integer [] ldp;
	static int [] arr;
	


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		arr = new int [n];
		rdp = new Integer [n];
		ldp = new Integer [n];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");


		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			lis(i);
			lds(i);
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			max = Math.max(rdp[i]+ldp[i], max);
		}
		System.out.println(max-1);

	}


	static int lis(int n)	{

		if(rdp[n]==null)	{
			rdp[n]=1;

			for (int i = n-1; i >=0; i--) {

				if(arr[i]<arr[n])	{
					rdp[n] = Math.max(rdp[n], lis(i)+1);
				}
			}
		}
		return rdp[n];
	}

	static int lds(int n)	{

		if(ldp[n]==null)	{
			ldp[n]=1;

			for (int i = n+1; i < ldp.length; i++) {

				if(arr[i]<arr[n]) {
					ldp[n] = Math.max(ldp[n], lds(i)+1);
				}
			}
		}
		return ldp[n];
	}

}
