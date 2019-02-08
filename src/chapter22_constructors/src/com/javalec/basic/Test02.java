package com.javalec.basic;
/*
 *  그렇다면 이 생성자 메소드를 '오버로드!!!!!'해서 
 *  여러 개를 만들어두면 
 *  객체를 생성할 때 여러 방법으로 생성할 수 있지 않을까?
 *  
 *  생성자 형식 : 
 *   클래스명(){ // public은 있어도 되고 없어도 된다.(아직까지는......)
 *   	
 *   }
 *   
 *  - 생성자는 '클래스이름과 동일'한 이름을 갖고 있고,
	- '리턴자료형'이 없다!
 */
class Person2 {
	String name;
	int age;
	String tel;
	
	// 아무 값도 넣고 싶지 않을 때를 위한 기본 생성자
	public Person2(){
		System.out.println("기본 생성자를 실행!");
	}
	
	// 이름만 넣고 객체 생성하고 싶을 때를 위한 생성자
	public Person2(String name){ // 문자열을 1개 넣으면 
		this.name = name;  // name에 저장
		System.out.println("이름 저장 완료!");
	}
	
	// 이름, 나이만 넣고 객체 생성하고 싶을 때를 위한 생성자
	public Person2(String name, int age){ // 문자열, 정수 넣으면 
		this.name = name; // 문자열은 name에
		this.age = age;  // 정수는 age에 저장
		System.out.println("이름, 나이 저장 완료!");
	}
	
	// 이름, 나이, 연락처를 모두 넣고 객체 생성하고 싶을 때를 위한 생성자
	public Person2(String name, int age, String tel){ // 문자열, 정수, 문자열 넣으면
		this.name = name; // 첫 번째 문자열은 name에
		this.age = age;   // 정수는 age에 
		this.tel = tel;   // 두 번째 문자열은 tel에 저장
		System.out.println("이름, 나이, 연락처 저장 완료!");
	}
	
	// 확인하기 쉽게 printData() 만들자.
	public void printData() {
		System.out.println("====" + this + "====");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age + "세");
		System.out.println("연락처 : " + this.tel);
		System.out.println();
	}
}
public class Test02 {
	public static void main(String[] args) {
		Person2[] p = new Person2[4];
		p[0] = new Person2(); // 기본 생성자를 실행!
		p[1] = new Person2("김피카츄"); // 이름 저장 완료!
		p[2] = new Person2("이푸린", 10); // 이름, 나이 저장 완료!
		p[3] = new Person2("박라이츄", 25, "010-1111-2222"); // 이름, 나이, 연락처 저장 완료!
		
		for(Person2 pp : p) {
			pp.printData();
		}
		/* < 출력 결과 >
		 
		 ====com.javalec.basic.Person2@7852e922====
		이름 : null
		나이 : 0세
		연락처 : null
		
		====com.javalec.basic.Person2@4e25154f====
		이름 : 김피카츄
		나이 : 0세
		연락처 : null
		
		====com.javalec.basic.Person2@70dea4e====
		이름 : 이푸린
		나이 : 10세
		연락처 : null
		
		====com.javalec.basic.Person2@5c647e05====
		이름 : 박라이츄
		나이 : 25세
		연락처 : 010-1111-2222
		
		 */
	}
}








