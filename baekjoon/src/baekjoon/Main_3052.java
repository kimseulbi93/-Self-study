package baekjoon;

import java.util.Scanner;

public class Main_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[10];
		int counts =0; 

		
		for(int i = 0; i<10; i++) {
			 N[i] = sc.nextInt() % 42; 	 
		}
		
		
		for(int i = 0; i < 10; i++) {  //10개중 중복 값이 있는지 검증하는 부분
			
			int cnt = 0;
			
			for(int j = i+1; j<10; j++) {
				if(N[i]==N[j]) {
					cnt++;	
				}
			}
				if (cnt == 0) {
					counts++;
				}
			}
			System.out.println(counts);
		}
	}

