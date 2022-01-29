package Algorithm_2022_01_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_4_10773_1 {
	static int [] stack;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			int check = Integer.parseInt(br.readLine());

			if(check==0)	{
				stack.pop();
			}
			else	{
				stack.push(check);
			}
		}

		int sum = 0;

		for(int o : stack)	{
			sum += o;
		}

		System.out.println(sum);
	}

}
