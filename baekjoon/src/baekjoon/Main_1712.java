package baekjoon;

import java.util.*;

public class Main_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // �������
		int B = sc.nextInt(); // ���� ���
		int C = sc.nextInt(); // ��Ʈ�� ����
		

		int result = 0;
		
		if(C <= B) {
			result = -1;
		} else {
			result = A / (C - B) + 1;
		}
		
		System.out.println(result);
	}

}
