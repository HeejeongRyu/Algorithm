package Algorithm_2022_03_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort_Study {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		insert(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void insert(int[] arr)	{
		for (int i = 1; i < arr.length; i++) {
			int target = arr[i];
			int j = i-1;
			
			while(j>=0 && target < arr[j])	{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = target;
		}
	}

}
/*
장점 - 알고리즘 단순, 이미 정렬되어있는경우 매우 효율적이다.
단점 - 평균,최악 시간 복잡도가 O(n^2)이다.
*/