package baekjoon;

import java.util.*;

public class Main_10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] su = new int[N];
		
		int Maxsu = -1000000;
		int Minsu = 1000000; 
		
		
		for(int i = 0; i < N; i++) {
			su[i] = sc.nextInt();
			
			if(su[i]>Maxsu) {
				Maxsu = su[i];
			}else if (su[i]<= Minsu) {
				Minsu = su[i];
			}
		}
		System.out.println(Minsu +" "+ Maxsu);
	}
}
