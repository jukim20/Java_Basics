package com.javalec.basic;

public class Test02 {
	public static void main(String[] args) {
//		아까 myfirstpackage에 만들어둔 Person 클래스를 사용해보자.
//		Person p = new Person(); // 에러!
//		 => 이 Test02 클래스 입장에서 Person 클래스는 외부 패키지(다른 동네)에 사는 녀석이다.
//		 => 외부 패키지의 클래스를 가져다 쓸 때는 이름만 가지고는 JVM이 찾지 못한다.
		
		
//		외부 패키지의 클래스 사용 방법은 2가지가 있다.
//		방법1. 클래스의 풀네임(소속 패키지까지)을 쓰는 방법
		myfirstpackage.Person p = new myfirstpackage.Person();
		
//		Test03으로 넘어가자.
	}
}
