package baekjoon;

import java.io.*;
import java.util.*;


public class Main_1316 {

	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int groupWordCount = n;
		 
		for( int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String word = st.nextToken();
			
			int[] checkArr = new int[26];
			checkArr[word.charAt(0) - 97] = -1;
			
			if(word.length() > 1) {
				
				for(int j = 1; j < word.length(); j++) {
					if(checkArr[word.charAt(j)-97] == -1 && word.charAt(j) != word.charAt(j-1)) {
						groupWordCount--;
						break;
					}
					checkArr[word.charAt(j)-97] = -1;
				}
			}
		}
		bw.write(String.valueOf(groupWordCount));
		bw.flush();
		br.close(); bw.close();
	}

}
