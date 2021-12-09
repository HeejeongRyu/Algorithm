package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_3_3009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		st = new StringTokenizer(br.readLine()," ");
		int [] cod1 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};

		st = new StringTokenizer(br.readLine()," ");
		int [] cod2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};

		st = new StringTokenizer(br.readLine()," ");
		int [] cod3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};


		int x,y;

		if(cod1[0]==cod2[0])	x = cod3[0];
		else if(cod1[0]==cod3[0]) x = cod2[0];
		else x = cod1[0];

		if(cod1[1]==cod2[1])	y = cod3[1];
		else if(cod1[1]==cod3[1]) y = cod2[1];
		else y = cod1[1];


		System.out.println(x+ " "+ y);

	}

}
