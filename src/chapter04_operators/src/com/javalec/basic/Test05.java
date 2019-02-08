package com.javalec.basic;

/*
 *  5. 논리연산자 : &&, ||, !
 *  : 논리연산자도 관계연산자와 마찬가지로 결과는 boolean 타입
 *  
 *  (1) && : 논리곱연산자(논리AND)
 *   : 양쪽 항이 모두 true면 최종 결과 true
 *     하나라도 거짓이면 false
 *   
 *  (2) || : 논리합연산자(논리OR)
 *   : 양쪽 항 중 최소 1개 항이 true면 최종 결과 true
 *     둘 다 거짓이어야 false
 *   
 *  (3) ! : 논리부정연산자(논리NOT)
 *   : 대상이 false면 최종 결과 true
 *     true면 false
 *     e.g. !(10==20) // true 
 */

public class Test05 {
	public static void main(String[] args) {
		boolean result;
		
		result = ( 10 < 20 && 15 < -5 );
		System.out.println(result); // false 
		
		result = ( 10 < 20 || 15 < -5 );
		System.out.println(result); // true
		
		System.out.println(!result);
		
//		Quiz.
//		int n = 1;
//		System.out.println(n++ == 2); 
//		어떻게 출력될까?
		
		
	}
}
