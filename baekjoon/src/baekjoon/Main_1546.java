package baekjoon;

import java.util.*;

public class Main_1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //과목수 입력 받기
		
		double max = 0;  //최대값 찾기위한 변수
		
		double[] su = new double [N];
		double sum = 0;   //총합? 
		
		for(int i = 0; i < N; i++) {
			su[i] = sc.nextInt();
			if(su[i] > max) {
				max = su[i];  //큰 값 계산 
			}	
		}  

		
		for(int i = 0; i < N ; i++) {
			su[i] = su[i]/max*100;
			sum+= su[i];
			
		}
		System.out.println(sum/N);
	}
}
