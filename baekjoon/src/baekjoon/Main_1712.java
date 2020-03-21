package baekjoon;

import java.util.*;

public class Main_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // 고정비용
		int B = sc.nextInt(); // 가변 비용
		int C = sc.nextInt(); // 노트북 가격
		

		int result = 0;
		
		if(C <= B) {
			result = -1;
		} else {
			result = A / (C - B) + 1;
		}
		
		System.out.println(result);
	}

}
