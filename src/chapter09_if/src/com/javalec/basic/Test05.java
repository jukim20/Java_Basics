package com.javalec.basic;

import java.util.Scanner;

/*
 *  < ���� : else if(��ø if��)�� ���� ��� >
 */
public class Test05 {
	public static void main(String[] args) {
		// Test04.java�� �ڵ�� ��� ������ ����. 
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���� : ");
		age = sc.nextInt();
		
		if(age <= 8) {
			System.out.println("������ �Ƶ�");
		} else {
			if(age <= 13) { 
				System.out.println("�ʵ��л�");
			} else {
				if(age <= 16) {
					System.out.println("���л�");
				} else {
					if(age <= 19) {
						System.out.println("����л�");
					} else {
						System.out.println("����(���л�)");
					}
				}
			}
		}
		
//		�Ʊ� �ռ� ����, ���ӹ����� 1���� {}�� �����ص� �Ǳ� ������ else if �� �����ϴ�.
//		�̰��� if�� �ȿ� if���� �����Ͽ�, else if�� ��ø if���̶� �Ҹ��⵵ �ϴ� �����̴�.
		
	}
}
// Quiz01.java ~ Quiz04.java