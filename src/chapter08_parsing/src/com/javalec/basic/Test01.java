package com.javalec.basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		// JOptionPane�� ����Ͽ� ���̸� �Է� �ް� 
		// 3�� �� ���̸� ���
		
//		int age = JOptionPane.showInputDialog("���̸� �Է��ϼ���."); // ����
//		showInputDialog�� �Է� ���� �����ʹ� ������ ���ڿ��� �޾ƿ´ٴ� �Ѱ谡 �ִ�.
//		��, ���̸� 20���� �Է��ߴ��ص� 20(int)�� �ƴ϶� "20"(String)�� ���̴�.  
		
		String sAge = JOptionPane.showInputDialog("���̸� �Է��ϼ���.");
		System.out.println("����� 3�� �� ���̴� " + (sAge+3) + "�� �Դϴ�.");
		
//		������� ����� �� �� �ִ�.. 
		
//		�׷��ٸ� ĳ����(����ȯ)�� �غ���?
//		System.out.println("����� 3�� �� ���̴� " + ((int)sAge+3) + "�� �Դϴ�."); // ����
		
//		���ڿ��� ��ȯ�� ����
//		����ȯ�� �ƴ� �Ľ�(parsing)�̶�� ������ ����ؾ� �Ѵ�.
	}
}
