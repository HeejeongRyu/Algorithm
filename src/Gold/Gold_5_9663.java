import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold_5_9663 {

	public static int [] arr;
	public static int n;
	public static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		arr = new int [n];
		
		nQueen(0);

		System.out.println(cnt);


	}

	public static void nQueen(int depth)	{

		if(depth==n)	{
			cnt++;
			return;
		}

		for (int i = 0; i <n; i++) {
			arr[depth] = i;

			if(possibility(depth))	{
				nQueen(depth+1);
			}
		}
	}

	public static boolean possibility(int depth)	{

		for (int i = 0; i < depth; i++) {

			if(arr[depth]== arr[i])	{
				return false;
			}

			else if(Math.abs(depth-i)==Math.abs(arr[depth]-arr[i]))	{
				return false;
			}
		}
		return true;
	}

}
