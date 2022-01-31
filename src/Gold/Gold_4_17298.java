package Algorithm_2022_02_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold_4_17298 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i])	{
				arr[stack.pop()]=arr[i];
			}
			
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
	
	}
}
