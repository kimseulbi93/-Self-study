package baekjoon;

import java.util.Scanner;

public class Main_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] ox = new String[n+1];
		
		for(int i = 0; i < n; i++) {
			int cnt = 0; 
			int sum = 0;
			
			ox[i] = sc.next();
			
			for(int j = 0; j < ox[i].length(); j++) {
				if(ox[i].charAt(j) == 'O') {
					sum += ++cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
		
	}

}
