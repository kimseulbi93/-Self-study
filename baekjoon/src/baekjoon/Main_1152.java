package baekjoon;

import java.util.*;

public class Main_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer strToken = new StringTokenizer(str, " ");
		System.out.println(strToken.countTokens());
	}

}
