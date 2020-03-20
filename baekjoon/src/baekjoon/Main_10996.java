package baekjoon;

import java.io.*;

public class Main_10996 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<2*N; i++) {
			
			if(i%2==1) { //È¦¼ö
				for( int j = 1; j <=N; j++) {
					if(j%2==1) {
						bw.write("*");
					}else {
						bw.write(" ");
					}
					
				}
			}
			
			else { //Â¦¼ö
				for(int j=1; j<=N; j++) {
					if(j%2 ==1) {
						bw.write(" ");
					}else {
						bw.write("*");
					}
				}
				
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}

}
