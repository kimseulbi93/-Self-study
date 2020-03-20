package baekjoon;

import java.util.*;
import java.io.*;



public class Test_5543 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int burger = Integer.MAX_VALUE;
		for (int i = 0; i <3; i++) {
			burger = Math.min(burger, Integer.parseInt(br.readLine()));
			
		}
		int drink = Integer.MAX_VALUE;
		for(int j = 0; j <2; j++) {
			drink = Math.min(drink, Integer.parseInt(br.readLine()));
		}
		
		bw.write(String.valueOf(burger+drink - 50));
		
		bw.flush();

		bw.close();
	}

}
