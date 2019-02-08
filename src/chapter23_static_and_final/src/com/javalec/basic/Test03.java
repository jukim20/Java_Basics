package com.javalec.basic;
class SampleClass2 {
	String instanceField = "이것은 인스턴스(non-static) 멤버 변수";
	static String classField = "이것은 클래스(static) 멤버 변수";
	
	void instanceMethod() {
		System.out.println("인스턴스(non-static) 메소드 실행!");
		System.out.println(instanceField);
		System.out.println(classField);
	}
	
	static void classMethod() {
		System.out.println("클래스(static) 메소드 실행!");
//		System.out.println(instanceField); // 에러!
//		참고 : static 메소드에서는 static 멤버만 사용할 수 있다. 왜일까???
		System.out.println(classField);
	}
}
public class Test03 {
	public static void main(String[] args) {
		// 메소드 또한, static 선언이 된 클래스 메소드인 경우 
		// 객체 생성 안해도 된다.
		SampleClass2.classMethod();
		
//		Math를 치고 '.'을 눌러보자. 그 때 뜨는 목록을 살펴보면
//		아이콘에 작게 's'가 써있을 것이다. static이라는 의미이다.
		
	}
}
