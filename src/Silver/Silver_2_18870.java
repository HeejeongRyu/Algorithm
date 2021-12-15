import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Silver_2_18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		int [] arr = new int [t];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int [] arrsort = arr.clone();
		Arrays.sort(arrsort);
		
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		
		for(int n : arrsort)	{
			if(!map.containsKey(n))	{
				map.put(n, idx++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int n : arr)	{
			sb.append(map.get(n)).append(" ");
		}
		System.out.println(sb);
		
		

	}

}
