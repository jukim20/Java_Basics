package com.javalec.basic;
/*
 * < this ������ ������ (�� �� ���� ���Ǥ�) >
 *  - this()�� ȣ���ϴ� �ڵ�� ���� ù ���̾�� �Ѵ�.
 */
class Person5 { // Test02.java�� Person2 Ŭ���� �״�� ������!
	String name;
	int age;
	String tel;
	
	public Person5(String name, int age, String tel){
		this.name = name; 
		this.age = age;  
		this.tel = tel;   
	}

//	public Person4(){
//		name = "����"; // ����! (this()�� ���� ����Ǿ�� ��.)
//		this(null, 0, null); 
//  } 
	
	public Person5(){
		this(null, 0, null); 
		name = "����"; 
	} 
}
public class Test05 {

}
