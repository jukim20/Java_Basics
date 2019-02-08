package com.javalec.basic;

public class Test03 {
	public static void main(String[] args) {
		
		// 변수는 초기화를 해두는 것이 안전하기때문에
		// 실무에서는 변수를 선언 + 초기화를 무조건 하는 편이다.
		// 보통 0으로 초기화를 한다.
		int num1 = 0;
		float num2 = 0.0f;
		double num3 = 0.0;
		
		char ch1 = 0;
		
//		String str1 = 0; // 에러
		String str1 = null;
//		참고: 문자열의 경우 0은 저장될 수 없고, 대신 null이라는 키워드를 사용한다.(null은 참고로 0번지 라는 의미이다)
		
//		참고 : 이때 null 대신 ""(empty string)을 사용하기도 한다.
		String str2 = "";
		
//		차이는 다음과 같다.
		System.out.println(str1 + "ㅋㅋㅋ"); // nullㅋㅋㅋ
		System.out.println(str2 + "ㅋㅋㅋ"); // ㅋㅋㅋ
		
//		참고:
//		에러 : str1 = 0;
//		하지만 다음은 가능하다.
		str1 = 0 + "ABC"; 
//		 -> 결과가 "0ABC"(문자열)가 되기때문
		
//		용어 : 변수의 접근 VS 변수의 호출
//		1) 접근 : 값 변경
//		2) 호출 : 값 보기
	}
}
