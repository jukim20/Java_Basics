package com.javalec.basic;

import java.util.Scanner;

/*
 *  < break�� ����? >
 *  : �����!
 */
public class Test02 {
	public static void main(String[] args) {
//		break�� ���� �Ʊ� switch���� �����غ���.
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("1�̴�!");
			//break;
		case 2: 
			System.out.println("2�׿�~~");
			//break;
		case 3: case 4: // num�� 3 Ȥ�� 4�� ��� 
			System.out.println("3 or 4�Դϴ�");
			//break;
		default:
			System.out.println("1~4�� �ƴϳ׿�!");
		}
		/*
		  < ��� ��(1) >
		  ������ �Է��ϼ��� : 2
		 2�׿�~~
		 3 or 4�Դϴ�
		 1~4�� �ƴϳ׿�!
		
		  < ��� ��(2) >
		  ������ �Է��ϼ��� : 7
		 1~4�� �ƴϳ׿�!

		  < ��� ��(3) >
		  ������ �Է��ϼ��� : 1
		 1�̴�!
	 	 2�׿�~~
		 3 or 4�Դϴ�
		 1~4�� �ƴϳ׿�!
		
		 break�� �߰����� ���� ������ switch����
		 �ش� case'���� �� �����϶�'�� �ǹ��̴�. 
		 break�� �߰��߰� �߰��ϰ� �Ǹ�, JVM�� break�� ���� �� switch {}(��)�� ���������Ƿ� 
		  ��������� �ش� case'�� ����'�ϰ� �ȴ�.
		*/
		
	}
}
// Quiz01.java