package com.javalec.basic;
/*
 * 생성자는 여러 개 만들어두면
 * 객체를 생성할 때 값을 한꺼번에 저장할 수 있기때문에 
 * 좀 더 편리하게 클래스를 사용할 수 있다. (클래스를 장기적으로 사용한다 가정했을 때.)
 * 
 * 하지만 주의점이 있다.
 * 
 * 우리가 생성자를 추가하면 
 * JVM이 기본으로 만들어줬던 '기본생성자'는 만들어지지 않는다.
 * 
 */
class Person3 {
	String name;
	int age;
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class Test03 {
	public static void main(String[] args) {
		Person3 p1 = new Person3("김피카츄", 10); // 은 가능하지만
//		Person3 p2 = new Person3(); // 는 불가능하다. (기본 생성자가 존재하지 않기 때문)
//		따라서 '아무것도 넣지 않아도' 객체가 생성될 수 있도록
//		보편적으로 기본 생성자를 클래스에 직접 기입한다.
//		(Person3 클래스 안에) public Person3(){} => 요런식으로 
		
	}
}














