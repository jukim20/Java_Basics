package com.javalec.basic;

import testpackage.AA;

/*
 *  < 접근제어자(=접근제한자) >
 *  - 대상의 노출범위를 지정하는 키워드 
 *  - 4가지가 있다.
 *   1. public : 공용의  		| 모두에게 노출하겠다!
 *   2. protected : 보호받는    | 다른 패키지에 노출하지 않는 대신, 자식클래스라면 노출하겠다. (소속 패키지 안에서는 모두에게 노출) => 아직 상속 안 배움
 *   3. 		  : default | 소속 패키지 안에서만 노출하겠다! (다른 패키지한테는 절대 노출 X) => 여태 우리가 사용했던 것!
 *   4. private : 개인적인        | 이 클래스 안에서만 노출하겠다! (클래스 외부라면 절대 노출 X)
 *  - 패키지를 기준으로 노출범위가 정해진다.
 *  
 *  testpackage.AA로 가보자!
 */
public class Test01 {
	public static void main(String[] args) {
		AA p  = new AA();
		System.out.println(p.publicStr);
//		System.out.println(p.protectedStr); // 접근 불가
//		System.out.println(p.defaultStr);	// 접근 불가
//		System.out.println(p.privateStr);	// 접근 불가
		
//		testpackage.Test02로 가자.
	}
}
