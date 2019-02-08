package com.javalec.basic;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {
		// JOptionPane을 사용하여 나이를 입력 받고 
		// 3년 뒤 나이를 출력
		
//		int age = JOptionPane.showInputDialog("나이를 입력하세요."); // 에러
//		showInputDialog는 입력 받은 데이터는 무조건 문자열로 받아온다는 한계가 있다.
//		즉, 나이를 20으로 입력했다해도 20(int)가 아니라 "20"(String)인 것이다.  
		
		String sAge = JOptionPane.showInputDialog("나이를 입력하세요.");
		System.out.println("당신의 3년 뒤 나이는 " + (sAge+3) + "세 입니다.");
		
//		예상외의 결과를 볼 수 있다.. 
		
//		그렇다면 캐스팅(형변환)을 해볼까?
//		System.out.println("당신의 3년 뒤 나이는 " + ((int)sAge+3) + "세 입니다."); // 에러
		
//		문자열을 변환할 때는
//		형변환이 아닌 파싱(parsing)이라는 개념을 사용해야 한다.
	}
}
