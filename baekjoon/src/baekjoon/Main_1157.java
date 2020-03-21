package baekjoon;

import java.util.Scanner;

public class Main_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();  //문자를 입력받을때 모든 문자를 대문자로 바꾼다.
		
		int [] cnt = new int [26];
		int max = 0;
		char result = '?';
		
		for(int i = 0; i < str.length(); i++) {
			cnt[str.charAt(i) - 65]++;
			 
			if(max < cnt[str.charAt(i)-65]) {
				max = cnt[str.charAt(i) - 65];
				result = str.charAt(i);
				
			} else if(max == cnt[str.charAt(i)-65]) {
				result = '?';
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
