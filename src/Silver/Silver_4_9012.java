package Algorithm_2022_01_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_4_9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			sb.append(check(br.readLine())).append('\n');
		}

		System.out.println(sb);

	}

	static String check(String a)	{

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);

			if(c == '(')	{
				stack.push(c);
			}

			else if(stack.empty())	{
				return "NO";
			}

			else	{
				stack.pop();
			}
		}

		if(stack.empty())	{
			return "YES";
		}
		else	{
			return "NO";
		}
	}

}
