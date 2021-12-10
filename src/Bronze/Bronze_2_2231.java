import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2_2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int result =0;
		
		for(int i = 0; i < n; i++) {
			int number = i;
			int sum = 0;	
			
			while(number != 0) {
				sum += number % 10;	// �� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���) 
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
		
		
	}

}
