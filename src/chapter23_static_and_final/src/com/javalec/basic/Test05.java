package com.javalec.basic;
/*
 * �̷� ��츦 ���ؼ��� static�� ����Ѵ�.
 * ( �� ���� ���������, ��� ��ü�� �̸� �����Ѵ�.)
 */
class BTeam {
	String name; // ���� �̸�
	static int teamCount; // ��ü ���� ��
//	teamCount�� ����ƽ���� ����
	
	void printData() {
		System.out.println("���� : " + this.name + "(ATeam�� ��ü ���� �� : " + teamCount + "��)");
	}
}
public class Test05 {
	public static void main(String[] args) {
		BTeam b1 = new BTeam();
		b1.name = "��ī��";
		b1.teamCount = 1; // ��ü ������ ��ī�� 1��
		
		// ���α� ���� �߰� 
		BTeam b2 = new BTeam();
		b2.name = "���α�";
		b2.teamCount = 2; // ���� ���α� ��ü���� 2 ����
		
		b1.printData(); // ���� : ��ī��(ATeam�� ��ü ���� �� : 2��) <--- !!!!
		b2.printData(); // ���� : ���α�(ATeam�� ��ü ���� �� : 2��)
		System.out.println();
		
		// �ð��� �귯, ���̸��� �������� ���Դ�
		BTeam b3 = new BTeam();
		b3.name = "���̸�";
		b3.teamCount = 3; // ���� ���̸� ��ü���� 3 ����
		
		b1.printData(); // ���� : ��ī��(ATeam�� ��ü ���� �� : 3��) <--- !!!!
		b2.printData(); // ���� : ���α�(ATeam�� ��ü ���� �� : 3��) <--- !!!!
		b3.printData(); // ���� : ���̸�(ATeam�� ��ü ���� �� : 3��)
		System.out.println();
		
	}
}
