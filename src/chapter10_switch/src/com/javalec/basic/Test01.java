package com.javalec.basic;

import java.util.Scanner;

/*
 * < switch-case문 >
 *  - 형식 : 
 *  	switch(기준값){
 *    	case 비교값1: 
 *   		기준값==비교값1일 때 실행할 명령문들
 *   		break;
 *   	case 비교값2: 
 *   		기준값==비교값2일 때 실행할 명령문들
 *   		break;
 *    	case 비교값3: 
 *   		기준값==비교값3일 때 실행할 명령문들
 *   		break;
 *    	case 비교값4: 
 *   		기준값==비교값4일 때 실행할 명령문들
 *   		break;
 *   	default: // 있어도 되고 없어도 됨.
 *    		기준값이 위의 모든 비교값과 다르면 실행할 명령문들
 *  	}
 * - 위의 case와 default를 레이블(label)이라고 한다. 
 *   ** label이란? : 코드에서 책갈피의 역할을 한다.
 *   				여기서부터 실행하라는 의미이며, 
 *   				세미콜론(;)이 아니라 콜론(:)으로 표시한다.  
 * - 주의! case로 실수는 지정될 수 없다.
 *   e.g. 
 *     case 3: (O)
 *     case 'A': (O)
 *     case "ABC": (O)
 *     case 3.14: (X) ==> 오차때문! 
 *     (원시자료형 파트에서, 실수는 오차율이 있다고했다. 예를 들어 3.14는 때에 따라 3.140000000004 등과 같은 오차가 발생할 가능성이 있다.)
 * - 주의! 기준값(소괄호 안에 들어갈 값)과 비교값(case 값)은 자료형이 같아야 한다.
 *   e.g. 
 *     char ch='A';
 *     swtich(ch){
 *     case 'A': (O)
 *     case "A": (X)
 *     }
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("1이당!");
			break;
		case 2: 
			System.out.println("2네용~~");
			break;
		case 3: case 4: // num이 3 혹은 4일 경우 
			System.out.println("3 or 4입니당");
			break;
		default:
			System.out.println("1~4는 아니네요!");
		}
		/*
		  < 출력 예(1) >
		  정수를 입력하세요 : 2
		 2네용~~
		
		  < 출력 예(2) >
		  정수를 입력하세요 : 7
		 1~4는 아니네요!

		 */
	}
}













