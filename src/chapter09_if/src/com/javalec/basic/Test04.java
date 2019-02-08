package com.javalec.basic;

import java.util.Scanner;

/*
 * < else if문 (중첩 if문) >
 * - if와 else를 합친 것
 * - 조건식을 여러 개 쓰고 싶을 때 
 *   e.g. 성인/미성년 말고 초등/중등/고등학생을 판별하고 싶을 때
 * - 형식 : 
 *		if(조건식1){
 *  		// 조건식이 true일 경우 실행할 문장들 (=if의 종속문장)
 *  	} else if(조건식2) {
 *  		// 위의 if의 조건식(조건식1)이 모두 false, 조건식2가 true일 경우 실행할 문장들 (=else if의 종속문장)
 *  	} else if(조건식3) {
 *  		// 위의 if의 조건식(조건식1, 조건식2)이 모두 false, 조건식3이 true일 경우 실행할 문장들 (=else if의 종속문장)
 *  	} else if(조건식4) {
 *  		// 위의 if의 조건식(조건식1, 조건식2, 조건식3)이 모두 false, 조건식4가 true일 경우 실행할 문장들 (=else if의 종속문장)
 *  	} else { // 있어도 되고 없어도 됨.
 *  		// 위의 모든 조건식이 false일 경우 무조건 실행 
 *  		// ** 보험 같은 존재..
 *      }
 *      
 * - 각 else 들은 바로 윗 줄의 if들의 짝꿍 들이다. 
 *   즉 13번 째 줄의 else는 11번 줄 if의 짝꿍
 *     15번 째 줄의 else는 13번 줄 if의 짝꿍
 *     17번 째 줄의 else는 15번 줄 if의 짝꿍
 *     19번 째 줄의 else는 17번 줄 if의 짝꿍
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if(age <= 8) {
			System.out.println("미취학 아동");
		} else if(age <= 13) {
			System.out.println("초등학생");
		} else if(age <= 16) {
			System.out.println("중학생");
		} else if(age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인(대학생)");
		}
		
//		주의! JVM은 조건식들을 순차적으로 확인하기 때문에 처음 true가 나온 if만 실행됨. 
//		e.g. 12살을 입력 했을 때, 비록 15는 13이하, 16이하, 19이하에 모두 true이지만
//		         맨 처음 걸리는 13이하만 실행됨.
		
//		주의! if ~ else (혹은 마지막 else if)는 1세트이다. 
//				=> 이들 중 1개만 실행한다.
	}
}





