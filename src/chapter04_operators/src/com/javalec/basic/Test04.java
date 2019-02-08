package com.javalec.basic;

import java.util.Scanner;

// 4. 관계연산자 : >, >=, <, <=, ==, !=
//  (1) == : 같다 
//  (2) != : 다르다

//  => 관계연산자의 결과값은 boolean이다.

public class Test04 {
	public static void main(String[] args) {
		
		boolean bool; 
		bool = 10 != 20;
		System.out.println(bool); // true
		
		bool = 10 == 20;
		System.out.println(bool); // false
		
		System.out.println( 10 >= 2 * 5 ); // true
		
//		중요! 문자열의 비교
//		문자열이 같은 지 다른지는 '=='나 '!='를 사용하지 않는 대신, .equals() 를 사용한다.
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("피카츄를 입력하세요 : ");
		
		str = sc.next(); // String 데이터를 입력 받는다.
		
		System.out.println("입력된 데이터 : " + str); 
		System.out.println("결과 : " + (str == "피카츄")); // false
		System.out.println("결과 : " + (str.equals("피카츄"))); // true
//		이클립스는 콘솔에 입력할 때 콘솔창을 한 번 클릭해야 함
		
//		사용방법 : 문자열1.equals(문자열2) => 결과는 true / false (boolean 형)
	
	}
}
