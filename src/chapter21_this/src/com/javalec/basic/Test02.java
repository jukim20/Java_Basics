package com.javalec.basic;
/*
 * ��� �츮�� �Ϻη� this�� ���� �ʴ��� 
 * Ŭ���� ���ο��� ��ü �ڽ��� ����� ��Ī�� ����
 * �ڵ����� this�� �ٴ´�. 
 */
class Person2 {
	String name;
	int age;
	
	void setData(String n, int a) {
		this.name = n; 
		this.age = a;   
	}
	
	String getData() {
		return "�̸� : " + this.name + "\n���� : " + this.age + "��";
	}
	void printData() {
		System.out.println( this.getData() );
	}
}
public class Test02 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		p.setData("����ī��", 10);
		p.printData();
	}
}
