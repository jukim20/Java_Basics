package com.javalec.basic;

import java.util.Scanner;

// 4. ���迬���� : >, >=, <, <=, ==, !=
//  (1) == : ���� 
//  (2) != : �ٸ���

//  => ���迬������ ������� boolean�̴�.

public class Test04 {
	public static void main(String[] args) {
		
		boolean bool; 
		bool = 10 != 20;
		System.out.println(bool); // true
		
		bool = 10 == 20;
		System.out.println(bool); // false
		
		System.out.println( 10 >= 2 * 5 ); // true
		
//		�߿�! ���ڿ��� ��
//		���ڿ��� ���� �� �ٸ����� '=='�� '!='�� ������� �ʴ� ���, .equals() �� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("��ī�� �Է��ϼ��� : ");
		
		str = sc.next(); // String �����͸� �Է� �޴´�.
		
		System.out.println("�Էµ� ������ : " + str); 
		System.out.println("��� : " + (str == "��ī��")); // false
		System.out.println("��� : " + (str.equals("��ī��"))); // true
//		��Ŭ������ �ֿܼ� �Է��� �� �ܼ�â�� �� �� Ŭ���ؾ� ��
		
//		����� : ���ڿ�1.equals(���ڿ�2) => ����� true / false (boolean ��)
	
	}
}
