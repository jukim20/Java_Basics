package com.javalec.basic;

/*
 *  5. �������� : &&, ||, !
 *  : �������ڵ� ���迬���ڿ� ���������� ����� boolean Ÿ��
 *  
 *  (1) && : ����������(��AND)
 *   : ���� ���� ��� true�� ���� ��� true
 *     �ϳ��� �����̸� false
 *   
 *  (2) || : ���տ�����(��OR)
 *   : ���� �� �� �ּ� 1�� ���� true�� ���� ��� true
 *     �� �� �����̾�� false
 *   
 *  (3) ! : ������������(��NOT)
 *   : ����� false�� ���� ��� true
 *     true�� false
 *     e.g. !(10==20) // true 
 */

public class Test05 {
	public static void main(String[] args) {
		boolean result;
		
		result = ( 10 < 20 && 15 < -5 );
		System.out.println(result); // false 
		
		result = ( 10 < 20 || 15 < -5 );
		System.out.println(result); // true
		
		System.out.println(!result);
		
//		Quiz.
//		int n = 1;
//		System.out.println(n++ == 2); 
//		��� ��µɱ�?
		
		
	}
}
