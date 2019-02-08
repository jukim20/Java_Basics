package com.javalec.basic;
/* 
 * < 상속(Inheritance) == 확장(extend) >
 * - 기존의 클래스를 '확장'하여 새 클래스를 만드는 작업 
 * - 중복 작업을 피할 수 있다. (새 클래스 만드는 기간이 짧음)
 * - 예)
 *   기존 클래스 : Person (이름, 나이, 연락처)
 *   새 클래스    :  Student(이름, 나이, 연락처, 점수, 등급)
 *              Employee(이름, 나이, 연락처, 직급, 월급)
 *              Patient(이름, 나이, 연락처, 병명, 주치의이름)
 *             => 이름, 나이, 연락처가 Person과 중복됨.
 *             => 이들은 Person 클래스를 상속 받아 작성하는 것이 편할 것임.
 * - 원본클래스 : 부모클래스 == 상위클래스 == 슈퍼클래스
 *   새   클래스 : 자식클래스 == 하위클래스 == 서브클래스 
 */

class Person { // 부모클래스 == 상위클래스 == 슈퍼클래스
	String name; 
	int age; 
	String tel;
	
	void printData() { 
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("연락처 : " + tel);
	}
}
class Student extends Person { // 자식클래스 == 하위클래스 == 서브클래스 
	// Person 클래스를 확장한 Student 클래스
	int point; 
	char grade;
}
class Employee extends Person {
	String position; int salary;
}
class Patient extends Person{
	String disease; String docName;
}
public class Test01 {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "김피카츄"; // Person으로부터 물려받은 name을 사용함.
		st.printData(); // Person으로부터 물려받은 printData()를 호출함.
	}
}
// Quiz01.java
