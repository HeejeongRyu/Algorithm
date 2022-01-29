package Algorithm_2022_01_29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_4_10773 {
	static int [] stack;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		stack = new int [n];
		int top = -1;
		
		for (int i = 0; i < stack.length; i++) {
			int check = Integer.parseInt(br.readLine());
			
			if(check==0)	{
				stack[top] = 0;
				top--;
			}
			else	{
				top++;
				stack[top] = check;
			}
		}
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum+=stack[i];
		}
		
		System.out.println(sum);
		
		
		
	}

}
