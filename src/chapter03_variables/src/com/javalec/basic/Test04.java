package com.javalec.basic;
/*
 * < 변수의 스코프(scope) >
 * - 오늘 배운 변수는 '지역변수(local variable)'라고 한다. (변수는 지역변수, 매개변수, 멤버변수로 구분된다.)
 * - 이러한 지역변수는 모든 영역(중괄호,'{}')에서 접근가능 한 것이 아니다.
 *   지역변수는 자신이 어느 영역안에서 선언되었는지에 따라 노출되는 범위가 존재한다.
 *   (이는 오늘 배운 변수 뿐만 아니라 앞으로 공부할 배열, 메소드, 클래스 등 모든 식별자도 해당된다.)
 *   이러한 노출 범위를 스코프라고 한다.
 * - 변수는 선언된 영역이 곧 노출 영역이다.
 * - 변수는 자신이 속한 영역이 시작되면('{') 태어나고, 
 *   				      영역이 끝나면('}') 소멸된다. (별표 백만개)
 */
public class Test04 {
	public static void main(String[] args) {
		
		int a = 10;
		{ // 메인 메소드 안의 또다른 영역 만듦 (의미는 없고 테스트를 위해..)  
			int b = 20;
			
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); // 에러! (b는 사라져있음)
		
	}
}
