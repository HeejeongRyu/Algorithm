package Algorithm_2022_04_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Gold_5_2565_2 {
	//�湮 ���θ� ���ϰ� �Ǵ��ϱ� ���� Integer ��ü �迭�� �����ߴ�.
	static Integer dp [];
	static int arr [][];
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		dp = new Integer [n];
		arr = new int [n][2];

		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}


		Arrays.sort(arr, new Comparator<int[]>(){

			@Override
			public int compare(int[]o1, int[]o2)	{
				return o1[0]-o2[0];
			}

		});

		int max = 0;

		for (int i = 0; i < n; i++) {
			max = Math.max(recur(i), max);
		}

		System.out.println(n-max);

	}

	static int recur(int n)	{
		if(dp[n]==null)	{

			dp[n] = 1;

			for (int i = n+1; i < dp.length; i++) {

				if(arr[n][1]<arr[i][1])	{
					dp[n] = Math.max(dp[n], recur(i)+1);
				}
			}
		}
		return dp[n];
	}

}
/*
 * ��ü���� ���� = ��ġ���ɰ��� + ö�Ű���
 * ö�Ű��� = ��ü���� - ��ġ���ɰ���
 * recur method ����
 * a�������� n��° ������ ����Ǿ��ִ� b�����뺸�� a��i��° �������� ������ �̾��� b�����밡 �ڿ� �ִ°��
 * ��ġ�� �ʱ� ������ ��ġ�� �� ���� �ִ�.
 * 
 * 2���� �迭�� ������ �ִ� ���� �����Ƿ� comparator�� �̿��Ͽ� �����Ѵ�.
 * 
 */
