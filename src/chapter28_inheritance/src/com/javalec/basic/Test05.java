package com.javalec.basic;
class Parent {
	String name;
}
class Child extends Parent {
	String name; // 부모에게 물려받은 name 말고도, 추가로 하나를 더 선언 (현재 Child가 가지고 있는 name은 2개)
	int age;
	
	void setChild(String n1, String n2, int a) {
		name = n1; // name == this.name
		super.name = n2;
		age = a;
	}
	
	void printChild() {
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
		System.out.println("this.age : " + this.age);
	}
}
public class Test05 {
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child();
		
		c1.setChild("피카츄", "라이츄", 10);
		c2.setChild("파이리", "꼬부기", 20);

		c1.printChild();
//		< 출력 결과 > 
//		this.name : 피카츄
//		super.name : 라이츄
//		this.age : 10
		
		c2.printChild();
//		< 출력 결과 > 
//		this.name : 파이리
//		super.name : 꼬부기
//		this.age : 20
	}
}
