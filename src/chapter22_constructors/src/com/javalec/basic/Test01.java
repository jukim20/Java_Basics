package com.javalec.basic;
/*
 * < 생성자 (constructors) >
 *  - 객체가 생성될 때 초기화를 담당하는 특수 메소드
 *  - 자바에서는 생성자를 호출하지 않으면 객체를 생성할 수 없다.
 *  - Person p = new Person();
 *  				 -------- => 이 부분이 생성자!
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		Person p = new Person();
		//             메소드명() => 결국 메소드 실행한다는 의미 (그런데 메소드 이름이 클래스 이름과 동일하다!) 
		// 우리는 여태 생성자를 만들어 본 적이 없지만..
		// 위의 코드가 가능했던 이유가 있다.
	}
}
class Person {
	String name;
	int age;
	
	// 우리가 생성자를 따로 만들지 않으면 자동으로 만들어지는 생성자 메소드가 있는데,
	// 이를 '기본생성자(=default 생성자)'라고 하며 형식은 다음과 같다.
	public Person() { // (public은 우리가 아직 배우지 않았으니 넘어가자.)
		// 내용은 없지만 메소드가 있긴 있다!
	}
	

}















