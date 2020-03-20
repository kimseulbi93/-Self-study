package baekjoon;

import java.io.*;
import java.util.*;

public class Main_10817 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int A = Integer.parseInt(st.nextToken());
	int B = Integer.parseInt(st.nextToken());
	int C = Integer.parseInt(st.nextToken());
	
		if( 1 <= A && A<=100 && 1 <= B && B<=100 && 1 <=C && C<=100) {
			int[] numArray = {A, B, C};
			Arrays.sort(numArray);
			System.out.println(numArray[1]);
			
		}
		
	}
}


