package Algorithm_2022_03_09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort_Study {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		bubble(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void bubble(int [] arr)	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j-1]>arr[j])	{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
/*
���� - ���������ϰ� �ҽ��ڵ尡 �������̴�.
���� - �ð����⵵�� �־�,�ּ�,��� ��� O(n^2)

*/