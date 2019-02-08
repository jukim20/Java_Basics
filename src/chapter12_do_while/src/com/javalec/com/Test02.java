package com.javalec.com;

/*
 * < while과 do-while의 차이 > 
 *  while    : 조건식-> 참이면 -> 실행 -> 조건식 -> 참이면 -> 실행
 *  do-while : 실행 -> 조건식 -> 참이면 -> 실행 -> 조건식 -> 참이면 -> 실행
 *   => do-while은 애초에 조건식이 false여도 무조건 1번 종속문장을 실행한다.   
 */
public class Test02 {
	public static void main(String[] args) {

		int num = 0;
		while (num == 100) {
			System.out.println("while문 실행될까?");
		}

		do {
			System.out.println("do-while문 실행될까?");
		} while (num == 100);
	}
}