package baekjoon;

import java.util.Scanner;

public class Main_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(Character.toString(str.charAt(i)));
		}
		System.out.println(sum);
	}
}
