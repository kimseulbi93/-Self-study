package baekjoon;

public class Main_4673 {

	public static void main(String[] args) {
		int limit = 10000;
		boolean generate[] = selfNumber(limit);
		
		for(int i = 1; i <= limit; i++ ) {
			
			if(!generate[i-1]){
				System.out.println(i);
			}
		}
	}
	
	public static boolean[] selfNumber(int limit) {
		boolean generate[] = new boolean[limit];
		
		
		for( int i = 1; i <= limit; i++) {
			int length = (int)(Math.log10(i)+1);
			String tmpI = Integer.toString(i);
			int sum = i;
			
			for(int j = 0; j<length; j++) {
				
				sum+=Integer.parseInt(tmpI.substring(j, j+1));
			}
			if(sum>= 1 && sum <=limit) {
				generate[sum-1] = true;
			}
		}
		
		return generate;
	}
}
