package com.javalec.basic;

import java.util.Scanner;
/* 
 * < if >
 *  - ���� : 
 *  	if(���ǽ�) {
 *  		// ���ǽ��� true�� ��� ������ ����� (=if�� ���ӹ���)
 *  	}
 *  - JVM�� if�� ������ '()' ���θ� ���� ������ ��, ���� ����� true��� '{}' ���θ� ����
 *    false��� '{}'�� �ǳ� ��.
 *   
 *  ** ����! ���ǽ��� ��� ���� ������ boolean�̾�� �Ѵ�.
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���̸� �Է��ϼ���.");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("����� �����Դϴ�.");
		}
		
//		age�� 20 �̻��� ��쿡�� "����� �����Դϴ�."�� ���, 
//		�׷��� ������ ���� X
		
//		��� �����
//		���ӹ����� 1���� ��� '{}'�� ������ �� ����. (���⼭ {}�� ���̶�� ǥ����)
//		���� �� �ڵ�� ������ ���� �ۼ��� �� ����. (������������ ����õ)
//		if(age >= 20) System.out.println("����� �����Դϴ�.");
	}
}
