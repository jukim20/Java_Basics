package com.javalec.basic;
class Parent2 {
	String str2;
	public Parent2() { // �⺻������ ��Ȱ
		
	}
	public Parent2(String s) { // ������ �߰� 
		str2 = s;
	}
}
class Child2 extends Parent2 {
	public Child2() { 
		super(); // Parent2() ����
	}
	public Child2(String str) {
		super(str); // Parent2(String s) ���� 
	}
}
public class Test03 {
	public static void main(String[] args) {
		Child2 c;
		c = new Child2(); // �⺻������ ����
		System.out.println(c.str2); // ����

		c = new Child2("��ī��"); // String 1���� �� ������(Child2�� 2��° ������) ����
		System.out.println(c.str2); // ��ī��
		
	}
}
