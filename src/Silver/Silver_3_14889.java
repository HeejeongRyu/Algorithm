import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_3_14889 {
	public static int t;
	public static int [][] arr;
	public static boolean [] chk;
	public static int min = Integer.MAX_VALUE;


	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());
		arr = new int [t][t];
		chk = new boolean [t];

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			for (int j = 0; j < t; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}


		combi(0,0);
		System.out.println(min);

	}

	public static void combi(int num, int cnt)	{

		if(cnt == t/2) {
			diff();
			return;
		}


		for (int i = num; i < t; i++) {
			if(!chk[i])	{
				chk[i] = true;
				combi(i+1, cnt+1);
				chk[i] = false;
			}
		}
	}


	public static void diff()	{
		int ts = 0;
		int tl = 0;
		for (int i = 0; i < t-1; i++) {
			for (int j = i+1; j < t; j++) {


				if(chk[i]==true && chk[j] ==true)	{
					ts += arr[i][j];
					ts += arr[j][i];
				}

				else if(chk[i]==false && chk[j] ==false)	{
					tl += arr[i][j];
					tl += arr[j][i];
				}
			}
		}

		int val  = Math.abs(ts - tl);

		if(val ==0)	{
			System.out.println(val);
			System.exit(0);;
		}

		min = Math.min(val, min);
	}

}
