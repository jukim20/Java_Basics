package com.javalec.basic;

public class Test03 {
	public static void main(String[] args) {
		// for���� �ʱ��, ���ǽ�, �������� ���� ���� ���� �ϴ�. (�����ݷ��� �����ϸ� �ȵ�)
		
		int a = 0;
		for( ; a<=10; a+=2 ) { // �ʱ�� ����
			System.out.println("a : " + a);
		}
		
		for(int b=0; ; b+=2 ) { // ���ǽ� ����
			System.out.println("b : " + b);
			if(b == 10) { break; } // b�� 10�� ������ for���� �����϶�
		}
		
		for(int c=0; c<=10; ) { // ������ ����
			System.out.println("c : " + c);
			c += 2;
		}
	}
}
// Quiz01.java