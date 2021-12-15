import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PKCS12Attribute;
import java.util.Arrays;
import java.util.Comparator;

public class Silver_5_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String [] arr = new String[t];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()==o2.length())	{
					return o1.compareTo(o2);
				}
				
				else	{
					return o1.length() - o2.length();
				}
			}
			
		});
		
		System.out.println(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			
			if(!arr[i].equals(arr[i-1]))	{
				System.out.println(arr[i]);
			}
		}
	}

}
