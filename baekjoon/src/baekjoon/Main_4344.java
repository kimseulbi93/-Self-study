package baekjoon;

import java.util.Scanner;

public class Main_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		int C = sc.nextInt();  //테스트 케이스 입력 받는다. 
		int N = 0;   //변수 설정
		
		double avg = 0;  //평균 값 셋팅
		int [] arr = new int[1000];  //
		
		for(int i = 0; i < C; i++) {
			N = sc.nextInt();
			int total = 0;
			int num = 0;
			
			for( int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
				total += arr[j];
			} //end  for
			
			avg = (double)total / N;
			
			for(int j = 0; j <N; j++) {
				if(arr[j]>avg) {
					num++;
				}
			}
			System.out.printf("%.3f", 100.0*num/N);
			System.out.println("%");
			
		}// endfor
	}  //end 
}
