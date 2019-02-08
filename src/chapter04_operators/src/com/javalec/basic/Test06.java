package com.javalec.basic;
/*
 * 6. ���ǿ�����(=���׿�����)
 * ���� : 
 *   ���ǽ� ? ���ǽ��� true�� ��� ������ ���� : ���ǽ��� false�� ��� ������ ����
 * �ǹ� : 
 *   ���ǽ��� �������� �� ����� true���� false������ ���� ������ ����� ����
 */
public class Test06 {	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int max = (n1>n2) ? n1 : n2;
		System.out.println("ū ���� " + max); // ū ���� 20
		
		String message = "n2�� 100���� ";
		message += n2 > 100 ? "ũ��." : "�۴�.";
		System.out.println(message); // n2�� 100���� �۴�.
		
//		����: ���ǿ����ڴ� �������� ����� �� �ִ�.
		message = ((n1>n2) ? "n1�� �� ũ��." : ( (n1<n2) ? "n1�� �� ũ��.":"�� ���� ����." ));
//		 => ù ��° ���ǽ��� ������ �� �� ��° ���ǿ����ڸ� ����
//		    (ù ��° ���ǽ��� ���̸� �� ��°�� �������� �ʴ´�.)
		System.out.println(message); // n1�� �� ũ��.
	}
}

// Quiz01 