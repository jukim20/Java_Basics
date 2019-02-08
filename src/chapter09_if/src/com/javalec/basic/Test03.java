package com.javalec.basic;

import java.util.Scanner;

/*
 * < else >
 * - if의 짝꿍
 * - 바로 위 if문의 '()'(조건식)이 false일 경우 무조건 실행
 * - 형식 : 
 *  	if(조건식){
 *  		// 조건식이 true일 경우 실행할 문장들 (=if의 종속문장)
 *  	} else {
 *  		// 조건식이 false일 경우 실행할 문장들 (=else의 종속문장)
 *  	}
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하세요.");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("당신은 성인입니다.");
		} else {
			System.out.println("당신은 미성년입니다.");
		}
		/*
		 *  else 주의점
		 *  1. 바로 위 문장이 if문이어야 한다. 
		 *  2. if문 없이 독립적으로 else만 사용할 수는 없다.
		 *  3. else는 '()'(조건식)이 붙지 않는다.
		 *  4. if-else 짝은 반드시 둘 중 하나가 수행되는 구조이다.
		 */

	}
}
