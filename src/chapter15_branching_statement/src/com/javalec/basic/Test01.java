package com.javalec.basic;
/*
 * < �б⹮(branching statements) >
 *  - �帧�� ���ų� �̵���Ű�� ���
 *  - ���� : break, continue, return
 *  
 * < break > 
 *  - switch��, �ݺ���(while, do-while, for)�� '����'�ϴ� Ű����
 *    (if�� �������� �ʴ´�.) 
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("break test");
		for(int i = 10; i >= 1; --i) {
			if(i % 4 ==0) { // i�� 4�� ������
				break; 
			}
			System.out.println(i);
		}
		
		/*
		 	< ��� >
		 	break test
			10
			9
		 */
	}
}
