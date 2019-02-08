package com.javalec.basic;
class Parent {
	String name;
}
class Child extends Parent {
	String name; // �θ𿡰� �������� name ����, �߰��� �ϳ��� �� ���� (���� Child�� ������ �ִ� name�� 2��)
	int age;
	
	void setChild(String n1, String n2, int a) {
		name = n1; // name == this.name
		super.name = n2;
		age = a;
	}
	
	void printChild() {
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
		System.out.println("this.age : " + this.age);
	}
}
public class Test05 {
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child();
		
		c1.setChild("��ī��", "������", 10);
		c2.setChild("���̸�", "���α�", 20);

		c1.printChild();
//		< ��� ��� > 
//		this.name : ��ī��
//		super.name : ������
//		this.age : 10
		
		c2.printChild();
//		< ��� ��� > 
//		this.name : ���̸�
//		super.name : ���α�
//		this.age : 20
	}
}
