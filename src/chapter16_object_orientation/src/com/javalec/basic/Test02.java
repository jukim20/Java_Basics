package com.javalec.basic;

public class Test02 { 
	public static void main(String[] args) {
//		< �ν��Ͻ� ��� �� ������ 1 >
		Person per1;
//		System.out.println(p1); // ����! (p1�� ���θ޼ҵ� �ȿ� ����Ǿ����Ƿ� ����������. �����Ⱚ�� ����ִ�.)
		
		per1= new Person();
		System.out.println(per1); // com.javalec.basic.Person@7852e922
		
//		< �ν��Ͻ� ��� �� ������ 2 >
//		 - ������������ 0��� null(0����, Ȥ�� '����'��� ��)�� ����ؾ� �Ѵ�.
//		Person per2 = 0; 	// X
//		Person per2 = null; // O
		
		
//		< �ν��Ͻ� ��� �� ������ 3 >		
		Person per2 = null;
//		per2.age = 20; 
		 // ����! ���� per2���� null�� ����Ǿ��ִ�. ��, ���� �ּҰ� ������ ���� �����̱� ������
		 // �ν��Ͻ��� ������� ���� �����̴�. ���� age��� ��(�������) ���� ã�ư� �� ����.
		per2 = new Person(); 
		per2.age = 20;
		
		System.out.println("per1�� ���� : " + per1.age); // per1�� ���� : 0
		System.out.println("per2�� ���� : " + per2.age); // per2�� ���� : 20
		
//		< �ν��Ͻ� ��� �� ������ 4 >
		per1 = per2; // per2�� ����ִ� �ּҰ��� per1���� �����϶�.
		System.out.println("per1�� ���� : " + per1.age); // per1�� ���� : 20
		System.out.println("per2�� ���� : " + per2.age); // per2�� ���� : 20
		// �̶� per1, per2�� 1���� �ν��Ͻ��� �ּҸ� ���ÿ� ���� �ֱ� ������ 
		// �� ���۷��������� ��� ������ ��ü�� �����ϰ� �ִ�. 
	}
}











