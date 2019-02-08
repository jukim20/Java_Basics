package com.javalec.basic;

import java.util.Scanner;
/* 
 * < if >
 *  - 형식 : 
 *  	if(조건식) {
 *  		// 조건식이 true일 경우 실행할 문장들 (=if의 종속문장)
 *  	}
 *  - JVM이 if를 만나면 '()' 내부를 먼저 실행한 후, 실행 결과가 true라면 '{}' 내부를 진행
 *    false라면 '{}'를 건너 뜀.
 *   
 *  ** 주의! 조건식의 결과 값은 무조건 boolean이어야 한다.
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이를 입력하세요.");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("당신은 성인입니다.");
		}
		
//		age가 20 이상일 경우에만 "당신은 성인입니다."가 출력, 
//		그렇지 않으면 실행 X
		
//		모든 제어문은
//		종속문장이 1개일 경우 '{}'를 생략할 수 있음. (여기서 {}는 블럭이라고도 표현함)
//		따라서 위 코드는 다음과 같이 작성할 수 있음. (가독성때문에 비추천)
//		if(age >= 20) System.out.println("당신은 성인입니다.");
	}
}
