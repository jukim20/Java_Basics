package com.javalec.basic;
/*
 * < �θ� ������ ���� ���� > 
 * - �θ� Ŭ������ �⺻�����ڸ� ������ ���� �ʴٸ�?
 *   �ڽ� Ŭ������ ������ �κп� 
 *   �θ� Ŭ������ ������ �ִ� ������ ����(�Ű����� ����)�� �°� super()�� ���� �־��־�� ��.
 */
class Parent3 {
	String str3; 
	public Parent3(String s) { // ������ �߰� (�⺻������ ����)
		str3 = s;
	}
}
class Child3 extends Parent3 {
//	public Child3() { 
//		super(); // ���� : Parent3�� �⺻ �����ڸ� ���� ���� ����
//	}
	public Child3() { 
		super("����"); // ���� �־��־�� ��.
	}
}
public class Test04 {
	public static void main(String[] args) {
		Child3 c;
		c = new Child3(); // �⺻������ ���� => super("����"); => Parent3("����"); => str3 = "����"; 
		System.out.println(c.str3); // ����
	}
}
