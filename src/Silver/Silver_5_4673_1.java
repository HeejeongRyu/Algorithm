package Test01;

public class Silver_5_4673_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] check = new boolean [100001];
		
		
		
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n<10001)	{
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 1; i < 10001; i++) {
			if(!check[i])	{
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	public static int d(int number)	{
		int sum = number;
		
		while(number != 0)	{
			sum = sum+ (number%10);
			number /= 10;
		}
		return sum;
	}

}

