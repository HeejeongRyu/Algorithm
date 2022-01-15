import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_3_5086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while(true)	{
			st = new StringTokenizer(br.readLine()," ");

			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if(n1==0 && n2==0)	{
				break;
			}
			else	{
				if(n1<n2 && n2%n1==0)	{
					sb.append("factor").append('\n');
				}
				else if(n1>n2 && n1%n2==0)	{
					sb.append("multiple").append('\n');
				}
				else	{
					sb.append("neither").append('\n');
				}
			}
		}

		System.out.println(sb);
	}

}
