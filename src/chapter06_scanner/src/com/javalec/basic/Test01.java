package com.javalec.basic;

import java.util.Scanner;

/*
 * < Scanner > 
 *  - �Է� ���� �����͸� ������ ��ü(�ɺθ���)
 *  - �Է� ��Ʈ���� �����͸� scan�ϴ� ����
 *  - ��а��� �ܼ� �Է¿����� ���
 *  - �ڵ��ϼ� : Scan -> ctrl + space + enter
 *    (�ڵ��ϼ��� �ؾ� ���� import ...�� �ڵ��ϼ� �ȴ�.)
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// - Scanner �ɺθ��� ���� + �̸��� sc�� ���� (�ڼ��� �ǹ̴� ���� �˾ƺ� ����)
		// - �̸�(sc)�� �����Ӱ� ���� �� ���� (��������)
		// - �ܼ�â�� �����͸� �Է� �޴� ���α׷���, �� Scanner�� �־�� ��
		//   �� �� �ٿ� �̸� ��δ� ���� ���� �����
		
		System.out.println("�̸��� �Է��ϼ���..");
		String name = sc.next(); // �Է� ���� �����͸� String���� �ν��ؼ� �̸� name�� �����϶�!
		// �Է� ���� �����Ͱ� String�̶�� sc.next()

		
		System.out.println("���̸� �Է��ϼ���..");
		int age = sc.nextInt(); // �Է� ���� �����͸� int�� �ν��ؼ� �̸� age�� �����϶�!
		// �Է� ���� �����Ͱ� int�̶�� sc.nextInt()
		
		System.out.println("Ű�� �Է��ϼ���..");
		double height = sc.nextDouble(); // �Է� ���� �����͸� double���� �ν��ؼ� �̸� height�� �����϶�!
		// �Է� ���� �����Ͱ� double�̶�� sc.nextDouble()
		
//		�׿� nextBoolean(), nextByte(), nextFloat() �� ���� ��ɵ��� ������ 
//		�츮�� �ַ� �� �� ��ɵ鸸 ����� ����
		
		System.out.println("=======�Էµ� ������========");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("Ű : " + height + "cm");
		
//		���� : �ѱ� �Է��� ���� �ܼ�â �� �� Ŭ���ϱ�
//		���� : nextInt()��� ������ �Է��� �� 
//		      nextDouble()��� ����, �Ǽ��� �Է��� ��
		
		
	}
}
