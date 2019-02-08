package com.javalec.quiz;

import javax.swing.JOptionPane;

public class Quiz02Solution {
	public static void main(String[] args) {
//		JOptionPane을 사용하여 이름과 키, 체중을 입력 받고
//		BMI(체질량) 지수를 출력하세요. 
//		이때 BMI 지수가 25이상이면 "비만", 아니면 "비만 아님"을 출력하세요.
//		t: 키 (*단위 : 미터)
//		BMI = w/(t^2) 
		
		double weight;
		double tall;
		double bmi;
		String name;
		String message;
		
		
		name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		
		weight = Double.parseDouble(JOptionPane.showInputDialog("체중을 입력하세요.(단위 kg)"));
//		String sWeight = JOptionPane.showInputDialog("체중을 입력하세요.(단위 kg)");
//		weight = Double.parseDouble(sWeight);
		
		tall = Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요.(단위 m)"));
//		String sTall = JOptionPane.showInputDialog("키를 입력하세요.(단위 m)");
//		tall = Double.parseDouble(sTall);
		
		bmi = weight/(tall*tall);
		message = (bmi >= 25) ? "비만" : "비만아님";
		JOptionPane.showMessageDialog(null, name + "님의 BMI 지수는 "+bmi+"로,\n" + message);
	}
}
