package com.javalec.basic;

public class Test03 {
	public static void main(String[] args) {
		
		// ������ �ʱ�ȭ�� �صδ� ���� �����ϱ⶧����
		// �ǹ������� ������ ���� + �ʱ�ȭ�� ������ �ϴ� ���̴�.
		// ���� 0���� �ʱ�ȭ�� �Ѵ�.
		int num1 = 0;
		float num2 = 0.0f;
		double num3 = 0.0;
		
		char ch1 = 0;
		
//		String str1 = 0; // ����
		String str1 = null;
//		����: ���ڿ��� ��� 0�� ����� �� ����, ��� null�̶�� Ű���带 ����Ѵ�.(null�� ����� 0���� ��� �ǹ��̴�)
		
//		���� : �̶� null ��� ""(empty string)�� ����ϱ⵵ �Ѵ�.
		String str2 = "";
		
//		���̴� ������ ����.
		System.out.println(str1 + "������"); // null������
		System.out.println(str2 + "������"); // ������
		
//		����:
//		���� : str1 = 0;
//		������ ������ �����ϴ�.
		str1 = 0 + "ABC"; 
//		 -> ����� "0ABC"(���ڿ�)�� �Ǳ⶧��
		
//		��� : ������ ���� VS ������ ȣ��
//		1) ���� : �� ����
//		2) ȣ�� : �� ����
	}
}
