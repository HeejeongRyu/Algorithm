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
���� - �ð����⵵ NlogN, �߰����� ������ �޸𸮸� �ʿ�� ���� �ʴ´�.
���� - Ư�� �����Ͽ� ������ �ްݤ��� ��������. ��͸� ����ϱ⿡ ��� ������� ���ϴ� ȯ���� ��쿡 ������ ����������.
*/