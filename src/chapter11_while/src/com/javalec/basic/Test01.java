package com.javalec.basic;
/*
 * < 반복문(loop) >
 *  - 조건식이 true일 동안 계속 반복하라
 *  - while, do-while, for, foreach문이 있음
 *  
 *  < while >
 *  - 형식 : 
 *   while(조건식){
 *   	// 조건식이 'true'동안 무한 반복시킬 코드
 *   }
 *  - 순서 : 조건식 연산 -> 결과 값이 true면 -> {}(종속문장) 실행 -> 
 *      다시 조건식 연산 -> 결과 값이 true면 -> {}(종속문장) 실행 ->
 *      다시 조건식 연산 -> 결과 값이 true면 -> {}(종속문장) 실행 ->
 *      다시 조건식 연산 -> 결과 값이 false면 -> {} 건너뜀(반복 종료)
 *  - 주의 : 
 *    애초에 조건식이 false라면 반복을 1번도 수행하지 않는다.
 */
public class Test01 {
	public static void main(String[] args) {
		int n = 0;
		while(n<=10) { // n이 10이하일 동안
			System.out.println(n);
		}
		// 위의 코드를 실행시키면 무한 반복 (무한 루프)됨을 볼 수 있다.
		// 강제 종료는 Console창 제일 우측에 ■ 버튼 누르면 됨.
	}
}
