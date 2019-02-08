package com.javalec.basic;
/*
 * < 객체 무결성 >
 * - 객체가 잘못된 데이터를 가지고 있지 않는 것.
 */
class Person1 { // 내가 만든 클래스 
	String name;
	int age;
}


public class Test01 { // 우리 부장님이 만드는 클래스
	public static void main(String[] args) {
		Person1 p = new Person1();
		
//		< 객체 무결성이 깨지는 사례 >
		p.age = -10; // 실수로 부장님이 나이를 잘못 저장함. 
					 // 객체 정보가 잘못 저장되면 그 객체는 무용지물이 된다.
			
//		비록 이것은 간단한 예시이니 별 문제는 없어도
//		만약 아주 중요한 정보가 잘못된다면 프로그램 전체에 지장이 생길 수도 있다.
		
	}
}






