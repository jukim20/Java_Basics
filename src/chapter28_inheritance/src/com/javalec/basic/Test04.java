package com.javalec.basic;
/*
 * < 부모 생성자 유의 사항 > 
 * - 부모 클래스가 기본생성자를 가지고 있지 않다면?
 *   자식 클래스의 생성자 부분에 
 *   부모 클래스가 가지고 있는 생성자 형식(매개변수 형식)에 맞게 super()에 값을 넣어주어야 함.
 */
class Parent3 {
	String str3; 
	public Parent3(String s) { // 생성자 추가 (기본생성자 없음)
		str3 = s;
	}
}
class Child3 extends Parent3 {
//	public Child3() { 
//		super(); // 에러 : Parent3이 기본 생성자를 갖고 있지 않음
//	}
	public Child3() { 
		super("없음"); // 뭐라도 넣어주어야 함.
	}
}
public class Test04 {
	public static void main(String[] args) {
		Child3 c;
		c = new Child3(); // 기본생성자 실행 => super("없음"); => Parent3("없음"); => str3 = "없음"; 
		System.out.println(c.str3); // 없음
	}
}
