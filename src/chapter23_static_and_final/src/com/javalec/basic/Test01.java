package com.javalec.basic;
/*
 * < static >
 * - 정적인, 고정된
 * - 자바에서의 static : 객체 생성 안해도 사용할 수 있고, 1개만 존재 
 *  1. 프로그램 실행 직전(클래스 로드 시) 미리 만들어진다(무조건 만들어진다). => 객체 생성을 안해도 사용할 수 있다. 
 *  2. '클래스명'으로 접근한다. => 객체명이 아니라...
 *  3. 한 개만 만들어진다. => 모든 객체가 공용으로 사용한다. (공유폴더 같은 역할)
 * - static 키워드는 필드(멤버변수), 메소드 앞에 붙일 수 있다. 클래스나 지역변수에는 붙일 수 없다.
 * - non-static : 인스턴스 멤버 <- 인스턴스 생성 시에 생성되는 멤버. 우리가 여태 만들어왔던 필드와 메소드 (메인메소드 빼고!)
 *   static     : 클래스    멤버 <- 클래스 로드 시에 생성되는 멤버
 *   
 *     ** 클래스 로드(class load)란?
 *      컴퓨터 프로그램을 실행할 때 '로딩 중'이라는 단어를 많이 봤을 것이다.
 *      로딩(loading; 적재)이란, 프로그램 실행에 필요한 메모리를 정하고, 필요한 상수(데이터) 등을 RAM 메모리에 복사하는 작업을 말하는데 
 *      그 중에서 클래스 로드는 클래스(설계도)파일 자체를 RAM에 복사하는 것을 말한다!
 *       
 *       (객체 생성 할 때 컴퓨터가 설계도 보면서 만들지 않음? 
 *        이 말은 설계도 자체도 메모리 어딘가에 있어야 컴퓨터가 읽을 수 있다는 의미임.
 *        원본 파일은 수정되면 안되니까 RAM에 그대로 복사를 하고(이것이 클래스 로드!), 그걸 읽어들이면서 프로그램을 진행함.)
 *       
 *  - 컴퓨터는 클래스 로드를 진행하는 중에 static으로 선언된 멤버들을 만날 때 마다 
 *    곧바로 그들을 RAM에 생성한다.
 *    즉, 프로그램이 시작될 때는 이미 그들이 존재한다!!
 *    반면에 non-static 멤버들은 '프로그램 진행 도중' 객체 생성 명령을 만나야(new 클래스명();) 만들어진다! 
 *      
 */

import javax.swing.JOptionPane;


public class Test01 {
	public static void main(String[] args) {
//		다음의 공통점을 찾아보다.
		Math.random();
		System.out.println();
		JOptionPane.showInputDialog("test");
		JOptionPane.showMessageDialog(null, "test");
		System.out.println( Math.PI );
//		 => random(), println(), showInputDialog(), showMessageDialog(), PI가
//		  1) 객체 생성 없이 사용된 것을 알 수 있다.
//		  2) 맨 앞 단어가 '클래스이름'이다.
//		         => 클래스 이름으로 시작되는 메소드/필드는 static으로 선언되어있는 멤버이다.
		
//		< static의 특징 2. 접근할 때는 객체명이 아닌 클래스명으로 접근한다. >
		Math.random(); // Math 클래스의 static 멤버 메소드 random()
		JOptionPane.showInputDialog("test"); // JOptionPane의 static 멤버 메소드 showInputDialog()
		JOptionPane.showMessageDialog(null, "test"); // JOptionPane의 static 멤버 메소드 showMessageDialog()
		double d = Math.PI; // Math 클래스의 static 멤버 변수 PI
		
		
	}
}









