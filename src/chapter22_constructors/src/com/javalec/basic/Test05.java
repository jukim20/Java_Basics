package com.javalec.basic;
/*
 * < this 생성자 주의점 (별 거 없음 주의ㅋ) >
 *  - this()를 호출하는 코드는 가장 첫 줄이어야 한다.
 */
class Person5 { // Test02.java의 Person2 클래스 그대로 가져옴!
	String name;
	int age;
	String tel;
	
	public Person5(String name, int age, String tel){
		this.name = name; 
		this.age = age;  
		this.tel = tel;   
	}

//	public Person4(){
//		name = "없음"; // 에러! (this()가 먼저 실행되어야 함.)
//		this(null, 0, null); 
//  } 
	
	public Person5(){
		this(null, 0, null); 
		name = "없음"; 
	} 
}
public class Test05 {

}
