package com.javalec.basic;

import javax.swing.JOptionPane;

/*
 * GUI 맛보기! - JOptionPane (자바 옵션 패널)
 *  * GUI(Graphic User Interface)란?
 *    - 마우스로 클릭하거나, 이미지를 띄울 수 있는 기능
 *    - 우리가 여태 사용한 콘솔 방식은 TUI(Text User Interface)
 * 
 * JOptionPane 자동완성 : jop -> ctrl + space -> enter (자동완성 해야 위에 import도 써짐.)
 * 
 *  1. .showMessageDialog() 
 *   자동완성 : (JOptionPane 써진 상태에서) .showm -> enter
 *   알림용으로 사용. 확인 버튼이 있다. 
 *   
 */
public class Test01 {	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "안녕하세요~");
		
		JOptionPane.showMessageDialog(null, "나는 \n피카츄!");
		                           //(null,  출력할 문자열);
	}
}
