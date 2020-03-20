package baekjoon;

import java.util.*;

public class Main_2523 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for( int j = 1; j<=2*N-1; j++) {
			for(int i = 1; i<=(j<N?j:2*N-j); i++) {
				System.out.print("*");
		
			}
			System.out.println();
		}
	}
}
