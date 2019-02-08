package com.javalec.basic;
/*
 * < super > 
 * - 자식 객체 속에 들어있는 부모 객체의 레퍼런스
 *   super. : 부모 클래스의 멤버
 *   super(): 부모 클래스의 생성자
 *    
 * < 자식 클래스의 객체화 >
 * - 자식 객체 생성 시, 부모 모양으로 객체가 먼저 만들어지고
 *   그 다음 자식의 고유 멤버들이 만들어진다.
 *   (부모 집 부터 만들어진다.)
 *  => 자식클래스의 생성자가 실행될 때, 부모 클래스의 생성자가 가장 먼저 호출되면서 
 *     부모 모양의 객체가 먼저 생성됨. 그리고 자식 고유의 멤버가 추가로 생성됨.
 *     
 * < 사실 this와 super는 같은 값이다! >
 *  : 자식 객체 속의 부모객체가 맨 앞에 있기 때문 (레퍼런스는 객체의 시작주소다.)
 *    this : 자식클래스 타입으로 인식
 *    super : 부모클래스 타입으로 인식
 */
class Parent1 {
	String str1;
	/*
	 * public Parent1(){ // 기본생성자가 자동으로 추가됨.
	 * 
	 * } 
	 */
}
class Child1 extends Parent1 {
	// 우리가 생성자를 따로 안만들면,
	// JVM이 만들어주는 기본 생성자 모양 
	public Child1() {
		super(); // 부모클래스 Parent1의 기본생성자를 실행하면서 부모 객체를 먼저 만들겠다!
	}
}

public class Test02 {
	public static void main(String[] args) {
		Child1 c = new Child1();
	}
}
