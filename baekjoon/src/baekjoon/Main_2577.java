package baekjoon;

import java.util.Scanner;

public class Main_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		if (A >= 100 & A <=1000 && B >= 100 & B <=1000 && C >= 100 & C <=1000 ) {  //
			
			int[] counts = new int[10]; //0~9ÀÇ °³¼ö
			int number = A * B* C; // °ö¼À °è»ê 
			
			while (number > 0) {
				counts[number%10]++;
				number /= 10;
			}
			
			for(int i = 0; i<counts.length; ++i) { 
				System.out.println(counts[i]);
				
			}
		}
	}
}
