package com.javalec.basic;

import javax.swing.JOptionPane;

/*
 * GUI ������! - JOptionPane (�ڹ� �ɼ� �г�)
 *  * GUI(Graphic User Interface)��?
 *    - ���콺�� Ŭ���ϰų�, �̹����� ��� �� �ִ� ���
 *    - �츮�� ���� ����� �ܼ� ����� TUI(Text User Interface)
 * 
 * JOptionPane �ڵ��ϼ� : jop -> ctrl + space -> enter (�ڵ��ϼ� �ؾ� ���� import�� ����.)
 * 
 *  1. .showMessageDialog() 
 *   �ڵ��ϼ� : (JOptionPane ���� ���¿���) .showm -> enter
 *   �˸������� ���. Ȯ�� ��ư�� �ִ�. 
 *   
 */
public class Test01 {	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "�ȳ��ϼ���~");
		
		JOptionPane.showMessageDialog(null, "���� \n��ī��!");
		                           //(null,  ����� ���ڿ�);
	}
}
