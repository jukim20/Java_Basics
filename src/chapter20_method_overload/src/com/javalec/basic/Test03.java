package com.javalec.basic;
/*
 *  < �޼ҵ� �����ε� ������ >
 *  - ������ �̸��� �޼ҵ尡 ���� ���� ��� (��, �޼ҵ尡 �����ε� �Ǿ����� ���) 
 *    �ش� �޼ҵ尡 'ȣ��Ǵ� ����'��, ��� �޼ҵ带 ������ �� �����Ѵ�.
 *  - �޼ҵ� �����ε�� �����ϸ� �ȵȴ�. 
 *    ������ ��� �����ؾ� �Ѵ�. 
 *    setData(String) => �̸��� ����
 *    setData(String, int) => �̸��� ���̸� ����
 *    setData(String, int, String) => �̸�, ����, ����ó�� ���� 
 *     ���� ���� : �����͸� ����(����)
 *         
 */
class Person3 {
	String name;
	int age;
	String tel;
	
//	1. �Ű����� '�̸�'�� �ٸ��ٰ� �Ͽ� ������ �����ε� �Ǵ� ���� �ƴϴ�.
	void setData(String n) { 
		name = n;
	}
//	void setData(String t) { // ����!! (setData()�� ����� �� ������ �����ؾ� �ϴ��� �𸥴�.)
//		tel = t;
//	}
	
//	2. '�����ڷ���'�� �ٸ��ٰ� �Ͽ� ������ �����ε� �Ǵ� ���� �ƴϴ�. 
	int setData(String n, int a) { // �����ڷ��� ���� ����
		name = n;
		age = a;
		return 1; 
	}
	
//	int setData(String n) { // ����! (JVM�� ������ �Ű����� ����, �ڷ����� ������.) 
//		return 1;
//	}
	
	void printData() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("����ó : " + tel);
		System.out.println();
	}
}
public class Test03 {

}
