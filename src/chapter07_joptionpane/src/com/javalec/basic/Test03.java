package com.javalec.basic;

import javax.swing.JOptionPane;


public class Test03 {
	public static void main(String[] args) {
		String name;
		name = JOptionPane.showInputDialog("����� �̸���?");
//		       ------------------------------------------
//		          -> ����ڰ� �ؽ�Ʈ�� �Է��ϸ�, �Է� ���� ������ String���·� ���ڸ��� ���ƿ�
//					 ����, �Է� ���� �ؽ�Ʈ�� Ȱ���Ϸ��� ������ ���� ����ؾ� ��.
		/*
		 * e.g. 
		 *  �ڵ� : name = JOptionPane.showInputDialog("����� �̸���?"); 
		 *       -> ��ī�� �Է��ߴٸ�
		 *  ��� : name = "��ī��";  
		 */
		
		System.out.println(name);
	}
}
