package com.javalec.basic;
/*
 * < �޼ҵ� �����ε� >
 * - �޼ҵ�� �ݵ�� ���ڰ��� �Ű������� ������ ����, ������ Ÿ���̾�� �Ѵ�. 
 *   ���� : 
 *   void aa(int a){
 *   
 *   }
 *   
 *   ȣ�� : 
 *   aa(10);   // (O)
 *   aa();     // (X)
 *   aa(3.14); // (X)
 * 
 *   ������ System.out.println()�� �����غ���. 
 *   System.out.println(10);   // (O)
 *   System.out.println();     // (X)
 *   System.out.println(3.14); // (X)
 *   System.out.println()�� ���� Ÿ���� ���ڰ��� ���� �� �ִ� ������ �����ϱ�?
 *     => �޼ҵ� �����ε�!
 *   
 * - �ϳ��� �޼ҵ带 �Ű����� ���� ���̸� �ξ� ���� �������� ����� �δ� ��
 * - �޼ҵ� �����ε带 ����ϴ� ��ǥ���� �޼ҵ� : sysout
 */
class Person {
	String name;
	int age;
	String tel;
	
	void setData(String n) { // setData() 
		name = n;
	}
	
	void setData(String n, int a) { // setData() �����ε�
		name = n;
		age = a;
	}
	
	void setData(String n, int a, String t) { // setData() �����ε�
		name = n;
		age = a;
		tel = t;
	}
	
	void printData() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("����ó : " + tel);
		System.out.println();
	}
}
public class Test01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setData("��ī��");
		p2.setData("������", 10);
		p3.setData("���̸�", 14, "010-1111-2222");
		// �����ε� �޼ҵ� ���� ���� : �޼ҵ尡 ����(ȣ��)�Ǵ� ������ 
		//                     ���� ���ڰ��� ���������� ���� ������ �޼ҵ带 �����Ѵ�.
		
		p1.printData();
		p2.printData();
		p3.printData();
		
//		< ��� > 
//		�̸� : ��ī��   // �̸��� ���õ�.
//		���� : 0��
//		����ó : null
//
//		�̸� : ������   // �̸���
//		���� : 10��     // ���̰� ���õ�
//		����ó : null
//
//		�̸� : ���̸�
//		���� : 14��
//		����ó : 010-1111-2222 // ��� ���õ�
	}
}
