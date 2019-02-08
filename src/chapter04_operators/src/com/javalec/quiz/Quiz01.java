package com.javalec.quiz;

import java.util.Scanner;

/*
 *  조건 연산자 문제(1)
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 : ");
		age = sc.nextInt(); // 사용자가 정수를 입력 + 그 값을 age에 저장
		
		System.out.println("당신의 나이는 " + age + "세입니다.");
		
		// 문제 : 성인인지 미성년자인지 sysout하세요. 
		// 다 하신 분들은 Quiz02도 해보세요.
	}
}

