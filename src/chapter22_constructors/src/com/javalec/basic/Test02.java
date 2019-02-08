package com.javalec.basic;
/*
 *  �׷��ٸ� �� ������ �޼ҵ带 '�����ε�!!!!!'�ؼ� 
 *  ���� ���� �����θ� 
 *  ��ü�� ������ �� ���� ������� ������ �� ���� ������?
 *  
 *  ������ ���� : 
 *   Ŭ������(){ // public�� �־ �ǰ� ��� �ȴ�.(����������......)
 *   	
 *   }
 *   
 *  - �����ڴ� 'Ŭ�����̸��� ����'�� �̸��� ���� �ְ�,
	- '�����ڷ���'�� ����!
 */
class Person2 {
	String name;
	int age;
	String tel;
	
	// �ƹ� ���� �ְ� ���� ���� ���� ���� �⺻ ������
	public Person2(){
		System.out.println("�⺻ �����ڸ� ����!");
	}
	
	// �̸��� �ְ� ��ü �����ϰ� ���� ���� ���� ������
	public Person2(String name){ // ���ڿ��� 1�� ������ 
		this.name = name;  // name�� ����
		System.out.println("�̸� ���� �Ϸ�!");
	}
	
	// �̸�, ���̸� �ְ� ��ü �����ϰ� ���� ���� ���� ������
	public Person2(String name, int age){ // ���ڿ�, ���� ������ 
		this.name = name; // ���ڿ��� name��
		this.age = age;  // ������ age�� ����
		System.out.println("�̸�, ���� ���� �Ϸ�!");
	}
	
	// �̸�, ����, ����ó�� ��� �ְ� ��ü �����ϰ� ���� ���� ���� ������
	public Person2(String name, int age, String tel){ // ���ڿ�, ����, ���ڿ� ������
		this.name = name; // ù ��° ���ڿ��� name��
		this.age = age;   // ������ age�� 
		this.tel = tel;   // �� ��° ���ڿ��� tel�� ����
		System.out.println("�̸�, ����, ����ó ���� �Ϸ�!");
	}
	
	// Ȯ���ϱ� ���� printData() ������.
	public void printData() {
		System.out.println("====" + this + "====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age + "��");
		System.out.println("����ó : " + this.tel);
		System.out.println();
	}
}
public class Test02 {
	public static void main(String[] args) {
		Person2[] p = new Person2[4];
		p[0] = new Person2(); // �⺻ �����ڸ� ����!
		p[1] = new Person2("����ī��"); // �̸� ���� �Ϸ�!
		p[2] = new Person2("��Ǫ��", 10); // �̸�, ���� ���� �Ϸ�!
		p[3] = new Person2("�ڶ�����", 25, "010-1111-2222"); // �̸�, ����, ����ó ���� �Ϸ�!
		
		for(Person2 pp : p) {
			pp.printData();
		}
		/* < ��� ��� >
		 
		 ====com.javalec.basic.Person2@7852e922====
		�̸� : null
		���� : 0��
		����ó : null
		
		====com.javalec.basic.Person2@4e25154f====
		�̸� : ����ī��
		���� : 0��
		����ó : null
		
		====com.javalec.basic.Person2@70dea4e====
		�̸� : ��Ǫ��
		���� : 10��
		����ó : null
		
		====com.javalec.basic.Person2@5c647e05====
		�̸� : �ڶ�����
		���� : 25��
		����ó : 010-1111-2222
		
		 */
	}
}








