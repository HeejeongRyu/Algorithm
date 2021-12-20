import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1_14888 {

	public static int [] arr;
	public static int [] cal = new int[4];
	public static int max = Integer.MIN_VALUE;
	public static int min = Integer.MAX_VALUE;
	public static int t;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = Integer.parseInt(br.readLine());

		arr = new int[t];

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < 4; i++) {
			cal[i] = Integer.parseInt(st.nextToken());
		}

		dfs(arr[0],1);

		System.out.println(max);
		System.out.println(min);



	}

	public static void dfs(int num,  int idx)	{

		if(idx == t)	{
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}

		for (int i = 0; i < 4; i++) {

			if(cal[i]>0)	{

				cal[i]--;

				switch(i)	{

				case 0: dfs(num+arr[idx], idx+1); break;
				case 1: dfs(num-arr[idx], idx+1); break;
				case 2: dfs(num*arr[idx], idx+1); break;
				case 3: dfs(num/arr[idx], idx+1); break;
				}

				cal[i]++;
			}
		}
	}

}
