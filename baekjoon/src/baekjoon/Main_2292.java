package baekjoon;

import java.util.*;

public class Main_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = 1;
		int roomNum = 1;
		
		int addNum = 6;
		while(true) {
			if( n <= roomNum) {
				break;
			}
			
			roomNum += addNum;
			addNum += 6;
			result++;
		}
		System.out.println(result);

	}

}
