package com.javalec.basic;
/*
 * < ���۷��� �迭 >
 * - �ν��Ͻ��� ���� �� �����Ͽ� �ϳ��� �迭�� ���
 * - �л� 100���� ������ ���� �����ʹ� �ν��Ͻ� 100���� �ʿ���
 */
class Pokemon {
	String name;
	String skill;
	int level;
}
public class Test01 {
	public static void main(String[] args) {
		Pokemon[] pArr; // Pokemon Ÿ�� �迭�� �ּҸ� ������ pArr ���� ���� 
		pArr = new Pokemon[100]; 
//		����! �޸��� 100���� ������ (�ν��Ͻ� 100���� ��������� ���� �ƴ�)
//		���� ���� �ڵ�� ����
//		pArr[0].name = "��ī��"; // NullPointerException
//	 	  => �迭�� ���� �� �ڵ����� 0���� �ʱ�ȭ�Ǳ� ������, ���۷����迭 ���� ��� �޸����� null�� �ʱ�ȭ
//		     null.name = "��ī��"; �� ���� �ǹ̰� �ȴ�.
//		���� �ν��Ͻ� ���� ���� ���� �ؾ� �Ѵ�.
		for(int i = 0; i < pArr.length; ++i) {
			pArr[i] = new Pokemon();
		}
		
		pArr[0].name = "��ī��"; // pArr�� 0�� �ν��Ͻ��� name ����� "��ī��"�� ����
		System.out.println(pArr[0].name);
	}
}






