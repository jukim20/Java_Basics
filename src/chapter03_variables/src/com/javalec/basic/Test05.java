package com.javalec.basic;
/*
 * < 변수 스코프 >
 * - 원래 변수 이름은 중복이 안되지만 영역이 구분되는 경우엔 가능하다.
 */
public class Test05 {
	public static void main(String[] args) {
		{
			int a = 10;
		}
		double a = 100;
		System.out.println(a); // 100
		// 처음 선언된 a는 
		// 10번 줄의 '}' 이후에 소멸된다.
		// 그래서 새롭게 a라는 이름을 사용할 수 있다.
		// 하지만 다음과 같이 코드를 뒤바꾸면 에러가 난다. (Test06.java로 이동)
	}
}
