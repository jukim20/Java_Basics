package com.javalec.basic;

// 3. ���������� : ++, --

public class Test03 {
	public static void main(String[] args) {
		
		// 1. ++ : ������ 1�� �����Ͽ� �ٽ� ����
		// 2. -- : ������ 1�� �����Ͽ� �ٽ� ����
		
		int n = 1;
		
		// ���������ڴ� ���� 1���� ��, Ȥ�� �ڿ� ����.
		++n;
		System.out.println(n); // 2
		--n;
		System.out.println(n); // 1
		
		n++;
		System.out.println(n); // 2
		--n;
		System.out.println(n); // 1
		
		// �̶� ++/--�� ���� �տ� ������ '��������'(= ��ġ����)
		//               �ڿ� ������ '��������'(= ��ġ����)           
		
		// ��ġ���� : ���� ��/���ϰ� ������ ��� ����		
		// ��ġ���� : ������ ��ɵ� ���� �����ϰ� �������� ��/��
		
		{ // ��ġ���� �׽�Ʈ
			int n1;
			int n2 = 1;
			n1 = ++n2; // ��ġ����
			System.out.println("n1�� �� : " + n1); // n1�� �� : 2
			System.out.println("n2�� �� : " + n2); // n2�� �� : 2
		}
		
		{ // ��ġ���� �׽�Ʈ
			int n1;
			int n2 = 1;
			n1 = n2++; // ��ġ����
			System.out.println("n1�� �� : " + n1); // n1�� �� : 1
			System.out.println("n2�� �� : " + n2); // n2�� �� : 2
		}
		
//		Quiz.
//		int data = 10;
//		System.out.println(++data); 
//		System.out.println(data++);
//		System.out.println(data);
//		�� 3 ���� ��� ��µɱ�?
	}
}
