package com.javalec.basic;

import java.util.Scanner;
/*
 * ���� for���� ���� 
 * ���� while���� ���� �ɱ�?
 * => Ƚ���� �˰ų� �ʱⰪ~������ �����Ǿ��ִٸ� for (e.g. 10�� �ݺ�, 50 ~ 100���� ���, ...)
 *    ���� �ݺ��� ���� �� �𸣸� while (e.g. ����ڰ� exit�� �����ϸ� ����)
 */
public class Test01 {
	public static void main(String[] args) {
//		while�� ��� �ϴ� ��ǥ���� ��Ȳ
		Scanner sc = new Scanner(System.in);
		int answer;
		int n1, n2;
		System.out.println("---������ ���� ����!---");
		while(true) { // ���� �ݺ��ϰڴ�!
			n1 = (int)(Math.random()*8) + 2;
			n2 = (int)(Math.random()*9) + 1; 
			System.out.println(n1 + "X" + n2 + "?");
			System.out.print("�� (����� 0): ");
			answer = sc.nextInt();
			if(answer == 0) { // ��, 0�� �Է��ߴٸ�
				break; // �ݺ� ����
			}
			
			if(answer == n1*n2) {
				System.out.println("����!");
			} else {
				System.out.println("��..");
			}
		}
		System.out.println("������ ����Ǿ����ϴ�.");
	}
}
