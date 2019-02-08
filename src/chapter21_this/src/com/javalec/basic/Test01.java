package com.javalec.basic;
/*
 * < this >
 *  - 객체 자신의 레퍼런스(주소값)
 *  - 우리가 자기 자신을 부를 때 이름 대신 '나'라고 하는 것과 비슷함.
 */
class Person {
	String name;
	int age;
	
//	void setData(String n, int a) {
//		name = n;
//		age = a;
//	}

//	 변수는 의미가 있도록 이름 짓는 것이 좋다.
//	매개변수 또한 마찬가지인데, 다음의 경우를 보자.
//	void setData(String name, int age) { 
//		name = name; // ?? 현재 매개변수와 멤버변수의 이름이 서로 같다.
//		age = age;   // 이럴 때는 제일 가까운 매개변수 name이 선택된다.
//	}
	
	void setData(String name, int age) {
		this.name = name; // 이때 앞에 'this.'을 쓰면  이 객체의 멤버 ~~라는 의미가 된다.
		this.age = age;   // this.age => 이 객체의 age 멤버
	}
//	이렇게 이름이 중복되는 경우, 이 객체의 멤버를 지칭하기위해서 this를 활용하면 된다.
}
public class Test01 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setData("김피카츄", 10);
		System.out.println(p.name);
	}
}

