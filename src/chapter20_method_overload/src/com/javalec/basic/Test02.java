package com.javalec.basic;
class Person2 {
	String name;
	int age;
	String tel;
	
	// ���� Ŭ���� �ȿ� �ִ� �޼ҵ峢���� ���� ȣ���� �� �ִ�.
	void setData(String n) { // setData() 
		name = n;
	}
	
	void setData(String n, int a) { // setData() �����ε�
		setData(n); // ù ��° setData()�� �����ϰڴ�!
		age = a;
	}
	
	void setData(String n, int a, String t) { // setData() �����ε�
		setData(n, a); // �� ��° setData()�� �����ϰڴ�!
		tel = t;
	}
	
	void printData() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("����ó : " + tel);
		System.out.println();
	}
}
public class Test02 {

}
