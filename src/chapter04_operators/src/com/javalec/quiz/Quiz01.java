package com.javalec.quiz;

import java.util.Scanner;

/*
 *  ���� ������ ����(1)
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("���� : ");
		age = sc.nextInt(); // ����ڰ� ������ �Է� + �� ���� age�� ����
		
		System.out.println("����� ���̴� " + age + "���Դϴ�.");
		
		// ���� : �������� �̼��������� sysout�ϼ���. 
		// �� �Ͻ� �е��� Quiz02�� �غ�����.
	}
}

