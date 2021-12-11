import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_5_1018 {
	static int min = 64;
	static boolean [][] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int m = Integer.parseInt(st.nextToken());

		int n = Integer.parseInt(st.nextToken());

		arr = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			String name = br.readLine();

			for (int j = 0; j < name.length(); j++) {
				if(name.charAt(j)=='W') arr[i][j] = true;
				else arr[i][j] = false;
			}
		}


		
		int m_row = m-7;	//88칸만들어야하는데 88이면 1개 99면은 꼭지점마다 1개씩 4개 구하기위해
		int n_col = n-7;
		
		for (int i = 0; i < m_row; i++) {
			for (int j = 0; j < n_col; j++) {
				find(i,j);
			}
		}
		System.out.println(min);



	}
	
	
	static void find(int x, int y)	{
		int endx = x+8;	//88칸을 만들기위한 마지막 x
		int endy = y+8;
		int cnt = 0;
		
		boolean tf = arr[x][y];
		
		for (int i = x; i < endx; i++) {
			for (int j = y; j < endy; j++) {
				
				
				if(arr[i][j]!=tf)	{
					cnt++;
				}
				tf =(!tf);	//다음칸이랑 달라야해서 바꿈
			}
			tf = !tf;	//현재칸 마지막색이랑 다음줄 맨처음색이랑 달라야하니까 해야함
		}
		
		cnt = Math.min(cnt, 64-cnt);	//총 64개 칸중 어떤 색을 칠하는게 최소값인지 확인하기위해
		
		min = Math.min(min, cnt);	// 최소값구하기
		
	}

}
