package com.javalec.basic;
/*
 * < Math.random() >
 * : 0.0 �̻� 0.99999999999 ������ �Ǽ� �� 1���� �����ϰ� ��ȯ
 *   �뵵: ���� �� ����, Ȯ�� �̺�Ʈ ����
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		double rand = Math.random(); 
		System.out.println(rand); // ������ ������ ���� ��� �ٲ����� ������ 0���� ũ�� 1���� ����
		
		// 0 ~ 9 �� 1���� ���� �����ϰ� ���
		System.out.println( (int)(Math.random()*10) );
		
		// 1 ~ 10 �� 1���� ���� �����ϰ� ���
		System.out.println( (int)(Math.random()*10) + 1 );
		
		// 2 ~ 11 �� 1���� ���� �����ϰ� ���
		System.out.println( (int)(Math.random()*10) + 2 );
		
		// 2 ~ 9 �� 1���� ���� �����ϰ� ���
		System.out.println( (int)(Math.random()*8) + 2 );
		// 1)      Math.random()      : 0.0 ~ 0.999999999
		// 2)      Math.random()*8    : 0.0 ~ 7.999999999
		// 3)(int)(Math.random()*8)   : 0 ~ 7
		// 4)(int)(Math.random()*8)+2 : 2 ~ 9
		
		
		// �� : (int)(Math.random()*����)+���ۼ�
	}
}

// Quiz01