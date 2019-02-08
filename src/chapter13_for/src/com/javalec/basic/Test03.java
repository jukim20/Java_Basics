package com.javalec.basic;

public class Test03 {
	public static void main(String[] args) {
		// for문의 초기식, 조건식, 증감식은 각각 생략 가능 하다. (세미콜론은 생략하면 안됨)
		
		int a = 0;
		for( ; a<=10; a+=2 ) { // 초기식 생략
			System.out.println("a : " + a);
		}
		
		for(int b=0; ; b+=2 ) { // 조건식 생략
			System.out.println("b : " + b);
			if(b == 10) { break; } // b가 10과 같으면 for문을 종료하라
		}
		
		for(int c=0; c<=10; ) { // 증감식 생략
			System.out.println("c : " + c);
			c += 2;
		}
	}
}
// Quiz01.java