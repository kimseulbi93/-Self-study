package baekjoon;

import java.util.*;

public class Main_1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //����� �Է� �ޱ�
		
		double max = 0;  //�ִ밪 ã������ ����
		
		double[] su = new double [N];
		double sum = 0;   //����? 
		
		for(int i = 0; i < N; i++) {
			su[i] = sc.nextInt();
			if(su[i] > max) {
				max = su[i];  //ū �� ��� 
			}	
		}  

		
		for(int i = 0; i < N ; i++) {
			su[i] = su[i]/max*100;
			sum+= su[i];
			
		}
		System.out.println(sum/N);
	}
}
