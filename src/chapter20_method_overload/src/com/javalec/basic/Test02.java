package com.javalec.basic;
class Person2 {
	String name;
	int age;
	String tel;
	
	// 같은 클래스 안에 있는 메소드끼리도 서로 호출할 수 있다.
	void setData(String n) { // setData() 
		name = n;
	}
	
	void setData(String n, int a) { // setData() 오버로드
		setData(n); // 첫 번째 setData()를 실행하겠다!
		age = a;
	}
	
	void setData(String n, int a, String t) { // setData() 오버로드
		setData(n, a); // 두 번째 setData()를 실행하겠다!
		tel = t;
	}
	
	void printData() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("연락처 : " + tel);
		System.out.println();
	}
}
public class Test02 {

}
