package Algorithm_2022_01_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_4_10828 {

	static int [] stack;
	static int size =0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		stack = new int [n];

		while(n-->0)	{

			st = new StringTokenizer(br.readLine()," ");

			switch(st.nextToken())	{

			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
				break;

			}
		}
		
		System.out.println(sb);

	}

	static void push(int a)	{
		stack[size] = a;
		size++;
	}

	static int pop()	{
		if(size==0)	{
			return -1;
		}
		else	{
			int res = stack[size-1];
			stack[size-1] =0;
			size--;
			return res;
		}
	}

	static int size() {
		return size;
	}

	static int empty() {
		if(size==0)	{
			return 1;
		}
		else	{
			return 0;
		}
	}

	static int top()	{
		if(size==0)	{
			return -1;
		}

		else	{
			return stack[size-1];
		}
	}

}
