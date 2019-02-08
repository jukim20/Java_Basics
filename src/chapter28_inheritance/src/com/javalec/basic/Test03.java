package com.javalec.basic;
class Parent2 {
	String str2;
	public Parent2() { // 기본생성자 부활
		
	}
	public Parent2(String s) { // 생성자 추가 
		str2 = s;
	}
}
class Child2 extends Parent2 {
	public Child2() { 
		super(); // Parent2() 실행
	}
	public Child2(String str) {
		super(str); // Parent2(String s) 실행 
	}
}
public class Test03 {
	public static void main(String[] args) {
		Child2 c;
		c = new Child2(); // 기본생성자 실행
		System.out.println(c.str2); // 없음

		c = new Child2("피카츄"); // String 1개가 들어갈 생성자(Child2의 2번째 생성자) 실행
		System.out.println(c.str2); // 피카츄
		
	}
}
