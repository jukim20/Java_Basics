package com.javalec.basic;
/*
 * 7. 형변환연산자(=casting 연산자)
 * 
 *  <형번환이란?>
 *   : 데이터의 자료형을 일시적으로 변환
 *     자동형변환, 강제형변환이 있다. 
 * 
 *  (1) 자동형변환 : 컴퓨터가 자동으로 형변환
 *  (2) 강제형변환 : 개발자가 직접 형변환 <= 이때 형변환연산자를 사용한다.
 *  
 *  
 *  형식 : (자료형)
 *  e.g. (int)a  => a의 데이터를 int로 바꿔라! 
 *       (double)3 => 3을 double로 바꿔라! (3.0)
 *       (char)65 => 65를 char로 바꿔라! ('A')
 *       
 *  형변환 연산자는, 나중에 나올 '다형성'에 큰 역할을 하니 
 *  지금 꼭 기억해두자!
 */
public class Test07 {
	public static void main(String[] args) {
		
		System.out.println('A'); // 는 A가 그대로 나온다.
		System.out.println('A' + 0); // 은 65가 나온다. 왜 그럴까? => 자동형변환
		
		// 자동형변환 예 (1)
		int num = 'A';
		System.out.println(num); // 65
		
		// 자동형변환 예 (2)
		double d = 3;
		// 변수는 반드시 자료형이 일치하는 데이터만 저장할 수 있다.
	    // 하지만 3은 int, d는 double형이다.
		// 이때 3이 3.0 (double형)으로 자동형변환되고 그 값이 d에 저장되는 원리이다.
		
		// 하지만 반대 상황의 경우를 보자.
		// int i = 3.9; // 에러!
		// 여기서는 자동형변환되지 않는다. (데이터 손실 우려때문)
		
		// 이런 경우 강제형변환을 사용할 수 있다. 
		int i = (int)3.9;
		
		// 참고 : 반올림되지 않는다.
		System.out.println(i); // 3
		
		// 참고 : 자동형변환의 우선 순위 
		// byte short int long float double
		// ---> 방향 : 자동형변환 O (e.g. byte를 float으로는 자동형변환 해줌)
		// <--- 방향 : 자동형변환 X (e.g. float을 byte로는 자동형변환 안해줌)
		//  (데이터가 손실될 가능성이 있는지 생각하면 어렵지 않다.)
		
	}
}
// Quiz04
