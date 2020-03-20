package baekjoon;

import java.util.*;

public class Main_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i = 0 ; i < arr.length ; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		int Max = -100;
		int index = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > Max) {
				
				Max = arr[i];
				index = i+1;
			}
		}
		System.out.println(Max);
		System.out.println(index);
		
	}
}
