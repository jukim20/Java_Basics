package com.javalec.quiz;

import javax.swing.JOptionPane;

public class Quiz02Solution {
	public static void main(String[] args) {
//		JOptionPane�� ����Ͽ� �̸��� Ű, ü���� �Է� �ް�
//		BMI(ü����) ������ ����ϼ���. 
//		�̶� BMI ������ 25�̻��̸� "��", �ƴϸ� "�� �ƴ�"�� ����ϼ���.
//		t: Ű (*���� : ����)
//		BMI = w/(t^2) 
		
		double weight;
		double tall;
		double bmi;
		String name;
		String message;
		
		
		name = JOptionPane.showInputDialog("����� �̸��� �Է��ϼ���.");
		
		weight = Double.parseDouble(JOptionPane.showInputDialog("ü���� �Է��ϼ���.(���� kg)"));
//		String sWeight = JOptionPane.showInputDialog("ü���� �Է��ϼ���.(���� kg)");
//		weight = Double.parseDouble(sWeight);
		
		tall = Double.parseDouble(JOptionPane.showInputDialog("Ű�� �Է��ϼ���.(���� m)"));
//		String sTall = JOptionPane.showInputDialog("Ű�� �Է��ϼ���.(���� m)");
//		tall = Double.parseDouble(sTall);
		
		bmi = weight/(tall*tall);
		message = (bmi >= 25) ? "��" : "�񸸾ƴ�";
		JOptionPane.showMessageDialog(null, name + "���� BMI ������ "+bmi+"��,\n" + message);
	}
}
