import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2_10870 {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		System.out.println(re(t));

	}
	
	static int re(int t)	{
		if(t==0) return 0;
		if(t==1) return 1;
		
		return re(t-1)+re(t-2);
	}

}
