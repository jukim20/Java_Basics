package com.javalec.basic;
/*
 * < 메소드 오버로드 >
 * - 메소드는 반드시 인자값과 매개변수는 동일한 개수, 동일한 타입이어야 한다. 
 *   정의 : 
 *   void aa(int a){
 *   
 *   }
 *   
 *   호출 : 
 *   aa(10);   // (O)
 *   aa();     // (X)
 *   aa(3.14); // (X)
 * 
 *   하지만 System.out.println()을 생각해보자. 
 *   System.out.println(10);   // (O)
 *   System.out.println();     // (X)
 *   System.out.println(3.14); // (X)
 *   System.out.println()에 여러 타입의 인자값을 넣을 수 있는 이유는 무엇일까?
 *     => 메소드 오버로드!
 *   
 * - 하나의 메소드를 매개변수 선언에 차이를 두어 여러 버전으로 만들어 두는 것
 * - 메소드 오버로드를 사용하는 대표적인 메소드 : sysout
 */
class Person {
	String name;
	int age;
	String tel;
	
	void setData(String n) { // setData() 
		name = n;
	}
	
	void setData(String n, int a) { // setData() 오버로드
		name = n;
		age = a;
	}
	
	void setData(String n, int a, String t) { // setData() 오버로드
		name = n;
		age = a;
		tel = t;
	}
	
	void printData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("연락처 : " + tel);
		System.out.println();
	}
}
public class Test01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.setData("피카츄");
		p2.setData("라이츄", 10);
		p3.setData("파이리", 14, "010-1111-2222");
		// 오버로딩 메소드 실행 원리 : 메소드가 실행(호출)되는 시점에 
		//                     넣은 인자값이 무엇인지에 따라 실행할 메소드를 결정한다.
		
		p1.printData();
		p2.printData();
		p3.printData();
		
//		< 결과 > 
//		이름 : 피카츄   // 이름만 세팅됨.
//		나이 : 0세
//		연락처 : null
//
//		이름 : 라이츄   // 이름과
//		나이 : 10세     // 나이가 세팅됨
//		연락처 : null
//
//		이름 : 파이리
//		나이 : 14세
//		연락처 : 010-1111-2222 // 모두 세팅됨
	}
}
