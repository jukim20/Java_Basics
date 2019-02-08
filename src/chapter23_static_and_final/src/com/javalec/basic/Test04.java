package com.javalec.basic;
/*
 * < �� ���� ���������. > 
 *  => ���� Ÿ���� ��� ��ü�� �̰� �ϳ��� �������� ����Ѵ�. (�������� ���� ����)
 *  => ��ü���� �������� ������ �־�� �� ������ ���� �� static�� ����Ѵ�.
 */
class ATeam {
	String name; // ���� �̸�
	int teamCount; // ��ü ���� ��
	
	void printData() {
		System.out.println("���� : " + this.name + "(ATeam�� ��ü ���� �� : " + this.teamCount + "��)");
	}
}
public class Test04 {
	public static void main(String[] args) {
		ATeam a1 = new ATeam();
		a1.name = "��ī��";
		a1.teamCount = 1; // ��ü ������ ��ī�� 1��
		
		// ���α� ���� �߰� 
		ATeam a2 = new ATeam();
		a2.name = "���α�";
		a2.teamCount = 2; // ��ü ������ ���� �θ�
		
		// ������! ��ī�� ���忡���� ���� teamCount�� 1���̴�.
		a1.printData(); // ���� : ��ī��(ATeam�� ��ü ���� �� : 1��)
		a2.printData(); // ���� : ���α�(ATeam�� ��ü ���� �� : 2��)
		System.out.println();
		
		// ���� a1���� ���� ���� 2������ �����ؾ� �Ѵ�.
		a1.teamCount = 2;
		
		// �ð��� �귯, ���̸��� �������� ���Դ�
		ATeam a3 = new ATeam();
		a3.name = "���̸�";
		a3.teamCount = 3; // ��ü ������ 3���� ��.
		
		// ������! �Ʊ�� ���� ������ ��ī��, ���α� ���忡���� TeamCount�� 2���̴�.
		a1.printData(); // ���� : ��ī��(ATeam�� ��ü ���� �� : 2��)
		a2.printData(); // ���� : ���α�(ATeam�� ��ü ���� �� : 2��)
		a3.printData(); // ���� : ���̸�(ATeam�� ��ü ���� �� : 3��)
		System.out.println();
		
		// ��ī��� ���α� ���忡���� ��ü ������ ������ �Ǿ�� �Ѵ�.
		a1.teamCount = 3;
		a2.teamCount = 3;

		a1.printData(); // ���� : ��ī��(ATeam�� ��ü ���� �� : 3��)
		a2.printData(); // ���� : ���α�(ATeam�� ��ü ���� �� : 3��)
		a3.printData(); // ���� : ���̸�(ATeam�� ��ü ���� �� : 3��)
		System.out.println();
		
		// �� �̾߱�� ���Ŀ� ������ ���� �߰��� �� ���� 
		// ��� ��ü�� teamCount�� ������ �����ؾ� �Ѵٴ� �ǹ��̴�!!
	}
}
