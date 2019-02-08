package com.javalec.basic;
/*
 * < 메소드 >
 * - 함수, 기능
 * - 기계!!!!!!!!!!!!!!!!!!!!
 * - 객체는 두 가지의 역할을 한다. 
 *  	1. 데이터 보관 => 멤버 변수
 *  	2. 데이터 처리(행위) => 멤버 메소드
 * - 사람으로 비유하면
 *   멤버 변수 : 이름, 주민번호, 키, 몸무게, 시력 등의 개인정보
 *   멤버 메소드 : 학교에 간다, 숨을 쉰다, 헬스장에 간다, 먹는다, 공부한다 등의 행위
 * - 객체가 움직이는 '방식(methods)'이라는 의미 
 * - 단어 끝에 '('가 있다면 이것은 무조건 메소드라는 의미이다. 
 *   e.g. System.out.println("Hello, World");
 *   	  Math.random();
 *   	  new Person();
 *   	  Integer.parseInt();
 *   	  sc.nextInt(); 
 *    => 여기서 println(), random(), Person(), parseInt(), nextInt()가 메소드. 
 * - 단순히 메소드는 어떤 동작을 하도록 설계되어있는 '기계'라고 생각하면 된다.
 * - 여태 우리는 남들이 만들어놓은 기계(println(), random(), Person(), parseInt(), nextInt() 등)를
 *   사용만 해보았다. 이제는 직접 만들어보자.
 * 
 * ** 메소드는 기계와 같은 역할을 한다.png로 이동
 * 
 */
class Person {
	String name;
	int age;
	String tel;
	
	void setData(String n, int a, String t) {
		name = n;
		age = a;
		tel = t;
		
	}
	
	void printInfo() {
		System.out.println(name + ", " + age + "세, tel." + tel);
		
	}
	
	String getData() {
		return "이름 : " + name + "\n나이 : " + age + "\n연락처 : " + tel;
	}
}
public class Test01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setData("김피카츄", 10, "010-1111-2222");
		p2.setData("이푸린", 5, "없음");
		
		p1.printInfo();
		p2.printInfo();
		System.out.println();
		
		String data = p1.getData();
		System.out.println(data);
		System.out.println(p2.getData());
		return;
	}
}
// ** Test02.java


















