package com.javalec.basic;
/*
 * < continue > 
 *  - �ݺ���(while, do-while, for)����, 
 *    continue ������ ���� ���ӹ����� �ǳʶٴ� Ű���� 
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println("continue test");
		for(int i = 10; i >= 1; --i) {
			if(i % 4 ==0) { // i�� 4�� ������
				continue; // �ؿ� ���� ����(���⼭�� sysout)�� �ǳʶپ��(+ ���ǽ����� �Ѿ��)
			}
			System.out.println(i);
		}
		
		/*
		 	< ��� >
		 	break test
			10
			9
			7
			6
			5
			3
			2
			1
			
				==> 4�� ����� ����� �ǳʶ�
		 */
		 
		/*
		 *  break�� continue�� ���̴� 
		 *  �ݺ��� �����ǳ� �ƴϳ�
		 */
	}
}








