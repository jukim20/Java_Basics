package com.javalec.basic;

// 2-1. ���Կ����� : =
// 2-2. ���մ��Կ����� : +=, -=, *=, /=, %=
public class Test02 {

	public static void main(String[] args) {
		
		int n1;
		
//		1. ���Կ����� : =	
//		 '='�� ���ٴ� ǥ���� �ƴϰ� '�����϶�'�� �ǹ��̴�. 
//		 ���� : ����ɸ޸� = �����ҵ����� 
//		 ���� : �յ� ���� ����
		
		n1 = 10;
//		���� : 10 = n1; // n1�� 10�� �����϶�? 
		
		int a = 10, b = 20; 
//		a = b�� b = a�� �ٸ���.
		
//		a = b; 
//		System.out.println(a); // 20
//		System.out.println(b); // 20
		
		b = a;
		System.out.println(a); // 10
		System.out.println(b); // 10
		
//		2. ���մ��Կ����� : +=, -=, *=, /=, %=
//		+= : ���ؼ� �ٽ� ���� ( a += b ===> a + b �� ���� a�� ���� )
//		-= : ���� �ٽ� ����    ( a -= b ===> a - b �� ���� a�� ���� )
//		*= : ���ؼ� �ٽ� ���� ( a *= b ===> a * b �� ���� a�� ���� )
//		/= : ������ �ٽ� ���� ( a /= b ===> a / b �� ���� a�� ���� )
//		%= : �������� �ٽ� ����( a %= b ===> a % b �� ���� a�� ���� )
		
		int c = 100, d = 200;
		System.out.println(c + d);
		System.out.println(c); // 100
		
		System.out.println(c += d); // �̶� c + d�� ���� c�� ����Ǹ鼭 c�� ���� �ٲ�
		System.out.println(c); // 300
		
//		Quiz.
//		System.out.println(c += 100);
//		System.out.println(c /= 3);
//		System.out.println(c *= 2);
//		System.out.println(c %= 3);
//		System.out.println(c);
//		�� 5 ���� ��� ��µɱ�? (c�� 300�� �����̴�.)
	}
}
