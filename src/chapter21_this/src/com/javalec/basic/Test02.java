package com.javalec.basic;
/*
 * 사실 우리가 일부러 this를 쓰지 않더라도 
 * 클래스 내부에서 객체 자신의 멤버를 지칭할 때는
 * 자동으로 this가 붙는다. 
 */
class Person2 {
	String name;
	int age;
	
	void setData(String n, int a) {
		this.name = n; 
		this.age = a;   
	}
	
	String getData() {
		return "이름 : " + this.name + "\n나이 : " + this.age + "세";
	}
	void printData() {
		System.out.println( this.getData() );
	}
}
public class Test02 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		p.setData("김피카츄", 10);
		p.printData();
	}
}
