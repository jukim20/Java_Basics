package com.javalec.basic;

import javax.swing.JOptionPane;


public class Test03 {
	public static void main(String[] args) {
		String name;
		name = JOptionPane.showInputDialog("당신의 이름은?");
//		       ------------------------------------------
//		          -> 사용자가 텍스트를 입력하면, 입력 받은 내용이 String형태로 이자리에 돌아옴
//					 따라서, 입력 받은 텍스트를 활용하려면 변수와 같이 사용해야 함.
		/*
		 * e.g. 
		 *  코드 : name = JOptionPane.showInputDialog("당신의 이름은?"); 
		 *       -> 피카츄를 입력했다면
		 *  결과 : name = "피카츄";  
		 */
		
		System.out.println(name);
	}
}
