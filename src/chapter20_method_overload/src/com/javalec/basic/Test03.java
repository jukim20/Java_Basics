package com.javalec.basic;
/*
 *  < 메소드 오버로드 주의점 >
 *  - 동일한 이름의 메소드가 여러 개일 경우 (즉, 메소드가 오버로드 되어있을 경우) 
 *    해당 메소드가 '호출되는 시점'에, 어느 메소드를 실행할 지 결정한다.
 *  - 메소드 오버로드는 남용하면 안된다. 
 *    목적은 모두 동일해야 한다. 
 *    setData(String) => 이름만 저장
 *    setData(String, int) => 이름과 나이를 저장
 *    setData(String, int, String) => 이름, 나이, 연락처를 저장 
 *     공통 목적 : 데이터를 세팅(저장)
 *         
 */
class Person3 {
	String name;
	int age;
	String tel;
	
//	1. 매개변수 '이름'이 다르다고 하여 무조건 오버로드 되는 것은 아니다.
	void setData(String n) { 
		name = n;
	}
//	void setData(String t) { // 에러!! (setData()가 실행될 때 무엇을 실행해야 하는지 모른다.)
//		tel = t;
//	}
	
//	2. '리턴자료형'이 다르다고 하여 무조건 오버로드 되는 것은 아니다. 
	int setData(String n, int a) { // 리턴자료형 변경 가능
		name = n;
		age = a;
		return 1; 
	}
	
//	int setData(String n) { // 에러! (JVM은 무조건 매개변수 개수, 자료형만 따진다.) 
//		return 1;
//	}
	
	void printData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("연락처 : " + tel);
		System.out.println();
	}
}
public class Test03 {

}
