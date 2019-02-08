package com.javalec.basic;
/*
 * 6. 조건연산자(=삼항연산자)
 * 형식 : 
 *   조건식 ? 조건식이 true일 경우 실행할 문장 : 조건식이 false일 경우 실행할 문장
 * 의미 : 
 *   조건식을 기준으로 그 결과가 true인지 false인지에 따라 실행할 명령을 선택
 */
public class Test06 {	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int max = (n1>n2) ? n1 : n2;
		System.out.println("큰 수는 " + max); // 큰 수는 20
		
		String message = "n2는 100보다 ";
		message += n2 > 100 ? "크다." : "작다.";
		System.out.println(message); // n2는 100보다 작다.
		
//		참고: 조건연산자는 연속으로 사용할 수 있다.
		message = ((n1>n2) ? "n1이 더 크다." : ( (n1<n2) ? "n1가 더 크다.":"두 수는 같다." ));
//		 => 첫 번째 조건식이 거짓일 때 두 번째 조건연산자를 실행
//		    (첫 번째 조건식이 참이면 두 번째는 실행하지 않는다.)
		System.out.println(message); // n1가 더 크다.
	}
}

// Quiz01 