package com.javalec.basic;

import java.util.Scanner;

/*
 *  < 참고 : else if(중첩 if문)의 원래 모습 >
 */
public class Test05 {
	public static void main(String[] args) {
		// Test04.java의 코드는 사실 다음과 같다. 
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		if(age <= 8) {
			System.out.println("미취학 아동");
		} else {
			if(age <= 13) { 
				System.out.println("초등학생");
			} else {
				if(age <= 16) {
					System.out.println("중학생");
				} else {
					if(age <= 19) {
						System.out.println("고등학생");
					} else {
						System.out.println("성인(대학생)");
					}
				}
			}
		}
		
//		아까 앞서 말한, 종속문장이 1개면 {}를 생략해도 되기 때문에 else if 가 가능하다.
//		이것이 if문 안에 if문이 들어갔다하여, else if를 중첩 if문이라 불리기도 하는 이유이다.
		
	}
}
// Quiz01.java ~ Quiz04.java