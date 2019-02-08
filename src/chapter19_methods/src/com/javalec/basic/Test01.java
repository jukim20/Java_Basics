package com.javalec.basic;
/*
 * < �޼ҵ� >
 * - �Լ�, ���
 * - ���!!!!!!!!!!!!!!!!!!!!
 * - ��ü�� �� ������ ������ �Ѵ�. 
 *  	1. ������ ���� => ��� ����
 *  	2. ������ ó��(����) => ��� �޼ҵ�
 * - ������� �����ϸ�
 *   ��� ���� : �̸�, �ֹι�ȣ, Ű, ������, �÷� ���� ��������
 *   ��� �޼ҵ� : �б��� ����, ���� ����, �ｺ�忡 ����, �Դ´�, �����Ѵ� ���� ����
 * - ��ü�� �����̴� '���(methods)'�̶�� �ǹ� 
 * - �ܾ� ���� '('�� �ִٸ� �̰��� ������ �޼ҵ��� �ǹ��̴�. 
 *   e.g. System.out.println("Hello, World");
 *   	  Math.random();
 *   	  new Person();
 *   	  Integer.parseInt();
 *   	  sc.nextInt(); 
 *    => ���⼭ println(), random(), Person(), parseInt(), nextInt()�� �޼ҵ�. 
 * - �ܼ��� �޼ҵ�� � ������ �ϵ��� ����Ǿ��ִ� '���'��� �����ϸ� �ȴ�.
 * - ���� �츮�� ������ �������� ���(println(), random(), Person(), parseInt(), nextInt() ��)��
 *   ��븸 �غ��Ҵ�. ������ ���� ������.
 * 
 * ** �޼ҵ�� ���� ���� ������ �Ѵ�.png�� �̵�
 * 
 */
class Person {
	String name;
	int age;
	String tel;
	
	void setData(String n, int a, String t) {
		name = n;
		age = a;
		tel = t;
		
	}
	
	void printInfo() {
		System.out.println(name + ", " + age + "��, tel." + tel);
		
	}
	
	String getData() {
		return "�̸� : " + name + "\n���� : " + age + "\n����ó : " + tel;
	}
}
public class Test01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setData("����ī��", 10, "010-1111-2222");
		p2.setData("��Ǫ��", 5, "����");
		
		p1.printInfo();
		p2.printInfo();
		System.out.println();
		
		String data = p1.getData();
		System.out.println(data);
		System.out.println(p2.getData());
		return;
	}
}
// ** Test02.java


















