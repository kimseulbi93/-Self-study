package baekjoon;

import java.util.Scanner;

public class Main_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.nextLine();
			
			String result = "";
			
			for( int j = 0; j < s.length(); j++ ) {
				for(int k = 0; k < r; k++) {
					
					result += s.charAt(j);
				}
				
				
			}
			result = result.replaceAll(" ","");
			System.out.println(result);		
		}

	}

}
