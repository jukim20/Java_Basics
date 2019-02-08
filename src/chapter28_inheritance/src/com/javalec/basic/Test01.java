package com.javalec.basic;
/* 
 * < ���(Inheritance) == Ȯ��(extend) >
 * - ������ Ŭ������ 'Ȯ��'�Ͽ� �� Ŭ������ ����� �۾� 
 * - �ߺ� �۾��� ���� �� �ִ�. (�� Ŭ���� ����� �Ⱓ�� ª��)
 * - ��)
 *   ���� Ŭ���� : Person (�̸�, ����, ����ó)
 *   �� Ŭ����    :  Student(�̸�, ����, ����ó, ����, ���)
 *              Employee(�̸�, ����, ����ó, ����, ����)
 *              Patient(�̸�, ����, ����ó, ����, ��ġ���̸�)
 *             => �̸�, ����, ����ó�� Person�� �ߺ���.
 *             => �̵��� Person Ŭ������ ��� �޾� �ۼ��ϴ� ���� ���� ����.
 * - ����Ŭ���� : �θ�Ŭ���� == ����Ŭ���� == ����Ŭ����
 *   ��   Ŭ���� : �ڽ�Ŭ���� == ����Ŭ���� == ����Ŭ���� 
 */

class Person { // �θ�Ŭ���� == ����Ŭ���� == ����Ŭ����
	String name; 
	int age; 
	String tel;
	
	void printData() { 
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("����ó : " + tel);
	}
}
class Student extends Person { // �ڽ�Ŭ���� == ����Ŭ���� == ����Ŭ���� 
	// Person Ŭ������ Ȯ���� Student Ŭ����
	int point; 
	char grade;
}
class Employee extends Person {
	String position; int salary;
}
class Patient extends Person{
	String disease; String docName;
}
public class Test01 {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "����ī��"; // Person���κ��� �������� name�� �����.
		st.printData(); // Person���κ��� �������� printData()�� ȣ����.
	}
}
// Quiz01.java
