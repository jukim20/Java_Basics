package com.javalec.basic;
/*
 * < this >
 *  - ��ü �ڽ��� ���۷���(�ּҰ�)
 *  - �츮�� �ڱ� �ڽ��� �θ� �� �̸� ��� '��'��� �ϴ� �Ͱ� �����.
 */
class Person {
	String name;
	int age;
	
//	void setData(String n, int a) {
//		name = n;
//		age = a;
//	}

//	 ������ �ǹ̰� �ֵ��� �̸� ���� ���� ����.
//	�Ű����� ���� ���������ε�, ������ ��츦 ����.
//	void setData(String name, int age) { 
//		name = name; // ?? ���� �Ű������� ��������� �̸��� ���� ����.
//		age = age;   // �̷� ���� ���� ����� �Ű����� name�� ���õȴ�.
//	}
	
	void setData(String name, int age) {
		this.name = name; // �̶� �տ� 'this.'�� ����  �� ��ü�� ��� ~~��� �ǹ̰� �ȴ�.
		this.age = age;   // this.age => �� ��ü�� age ���
	}
//	�̷��� �̸��� �ߺ��Ǵ� ���, �� ��ü�� ����� ��Ī�ϱ����ؼ� this�� Ȱ���ϸ� �ȴ�.
}
public class Test01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setData("����ī��", 10);
		System.out.println(p.name);
	}
}

