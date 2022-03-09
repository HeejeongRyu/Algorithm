package Algorithm_2022_03_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuickSort_Study {
	
	static void quick(int [] arr)	{
		quick(arr, 0, arr.length-1);
	}
	static void quick(int[] arr, int start, int end)	{
		int part2 = partition(arr,start,end);
		if(start < part2 -1)	{
			quick(arr, start, part2-1);
		}
		if(part2<end)	{
			quick(arr,part2,end);
		}
		
	}
	
	static int partition(int[] arr, int start, int end)	{
		int pivot = arr[(start+end)/2];
		
		while(start <=end)	{
			while(arr[start]<pivot)	start++;
			while(arr[end]>pivot) end--;
			if(start<=end)	{
				swap(arr,start,end);
				start++;
				end--;
			}
		}
		return start;
		
	}
	
	static void swap(int[] arr, int start, int end)	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		quick(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
/* 
장점 - 시간복잡도 NlogN, 추가적인 별도의 메모리를 필요로 하지 않는다.
단점 - 특정 조건하에 성능이 급격ㅎ게 떨어진다. 재귀를 사용하기에 재귀 사용하지 못하는 환경일 경우에 구현이 복잡해진다.
*/