package Algorithm_2022_03_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectionSort_Study {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		select(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void select(int [] arr)	{
		int indexmin, temp;
		for (int i = 0; i < arr.length-1; i++) {
			indexmin = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[indexmin])	{
					indexmin = j;
				}
			}

			temp = arr[indexmin];
			arr[indexmin] = arr[i];
			arr[i] = temp;
		}
	}

}
/*
장점 - 알고리즘이 단순
단점 - 시간복잡도가 O(n^2)으로, 비효율적이다.
 */
