package com.javalec.basic;

import java.util.Scanner;

/*
 *  < break가 뭐지? >
 *  : 멈춰라!
 */
public class Test02 {
	public static void main(String[] args) {
//		break문 없이 아까 switch문을 실행해보자.
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("1이당!");
			//break;
		case 2: 
			System.out.println("2네용~~");
			//break;
		case 3: case 4: // num이 3 혹은 4일 경우 
			System.out.println("3 or 4입니당");
			//break;
		default:
			System.out.println("1~4는 아니네요!");
		}
		/*
		  < 출력 예(1) >
		  정수를 입력하세요 : 2
		 2네용~~
		 3 or 4입니당
		 1~4는 아니네요!
		
		  < 출력 예(2) >
		  정수를 입력하세요 : 7
		 1~4는 아니네요!

		  < 출력 예(3) >
		  정수를 입력하세요 : 1
		 1이당!
	 	 2네용~~
		 3 or 4입니당
		 1~4는 아니네요!
		
		 break를 추가하지 않은 원래의 switch문은
		 해당 case'부터 쭉 실행하라'는 의미이다. 
		 break를 중간중간 추가하게 되면, JVM이 break를 만날 때 switch {}(블럭)을 빠져나가므로 
		  결과적으로 해당 case'만 실행'하게 된다.
		*/
		
	}
}
// Quiz01.java