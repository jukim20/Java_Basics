package com.javalec.basic;
/*
 * �����ڴ� ���� �� �����θ�
 * ��ü�� ������ �� ���� �Ѳ����� ������ �� �ֱ⶧���� 
 * �� �� ���ϰ� Ŭ������ ����� �� �ִ�. (Ŭ������ ��������� ����Ѵ� �������� ��.)
 * 
 * ������ �������� �ִ�.
 * 
 * �츮�� �����ڸ� �߰��ϸ� 
 * JVM�� �⺻���� �������� '�⺻������'�� ��������� �ʴ´�.
 * 
 */
class Person3 {
	String name;
	int age;
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class Test03 {
	public static void main(String[] args) {
		Person3 p1 = new Person3("����ī��", 10); // �� ����������
//		Person3 p2 = new Person3(); // �� �Ұ����ϴ�. (�⺻ �����ڰ� �������� �ʱ� ����)
//		���� '�ƹ��͵� ���� �ʾƵ�' ��ü�� ������ �� �ֵ���
//		���������� �⺻ �����ڸ� Ŭ������ ���� �����Ѵ�.
//		(Person3 Ŭ���� �ȿ�) public Person3(){} => �䷱������ 
		
	}
}














