package com.javalec.basic;
/*
 * < Ȯ�� for�� ��� �� ������ >
 */
public class Test02 {
	public static void main(String[] args) {
		
		Pokemon[] pok = { new Pokemon(), new Pokemon(), new Pokemon() }; 
		
		pok[0].name = "��ī��";
		pok[0].level = 20;
		pok[0].skill = "�鸸��Ʈ ����";
		
		pok[1].name = "��ī��";
		pok[1].level = 10;
		pok[1].skill = "õ����Ʈ ����";
		
		pok[2].name = "���̸�";
		pok[2].level = 5;
		pok[2].skill = "ȸ���� �Ҳ�";
		
		for(int i = 0; i < pok.length; ++i) {
			System.out.println("====<" + (i+1) + "�� ���ϸ� ����>====");
			System.out.println("�̸� : " + pok[i].name);
			System.out.println("���� : " + pok[i].level);
			System.out.println("��� : " + pok[i].skill);
			System.out.println();
		}
		
		for(Pokemon p : pok) {
			p.name = "����";
		}
		// ��� �ɱ�?
		System.out.println(pok[0].name); // ����
		System.out.println(pok[1].name); // ����
		System.out.println(pok[2].name); // ����
	}
}








