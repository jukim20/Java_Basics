package com.javalec.basic;

import java.util.Scanner;
/*
 * 언제 for문을 쓰고 
 * 언제 while문을 쓰는 걸까?
 * => 횟수를 알거나 초기값~끝값이 지정되어있다면 for (e.g. 10번 반복, 50 ~ 100까지 출력, ...)
 *    언제 반복이 끝날 지 모르면 while (e.g. 사용자가 exit를 선택하면 종료)
 */
public class Test01 {
	public static void main(String[] args) {
//		while을 써야 하는 대표적인 상황
		Scanner sc = new Scanner(System.in);
		int answer;
		int n1, n2;
		System.out.println("---구구단 게임 시작!---");
		while(true) { // 무한 반복하겠다!
			n1 = (int)(Math.random()*8) + 2;
			n2 = (int)(Math.random()*9) + 1; 
			System.out.println(n1 + "X" + n2 + "?");
			System.out.print("답 (종료는 0): ");
			answer = sc.nextInt();
			if(answer == 0) { // 단, 0을 입력했다면
				break; // 반복 종료
			}
			
			if(answer == n1*n2) {
				System.out.println("정답!");
			} else {
				System.out.println("땡..");
			}
		}
		System.out.println("게임이 종료되었습니다.");
	}
}
