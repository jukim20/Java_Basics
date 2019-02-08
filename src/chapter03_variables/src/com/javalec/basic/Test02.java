package com.javalec.basic;

public class Test02 {
	public static void main(String[] args) {
		
//		1. 각 자료형에 따른 변수 선언
		byte num1;
		short num2;
		int num3;
		long num4;
		float num5;
		float num6;
		char ch1;
		String str;
		boolean bool1;
//		참고 : 노란줄의 의미? => 호출(=사용)된 적이 없음. 뭣하러 만들었니?라는 의미
		
		
//		2. 선언 및 초기화를 동시에!
		int n = 10; 
		
//		3. 변수에 데이터 저장 시 연산도 가능하다.
		n = 10 * 3;
		
//		4. '같은 자료형'의 변수를 여러 개 선언한다면 다음과 같이 사용 가능
		int a,b,c;
//		int a;
//		int b;
//		int c; 
//		과 같은 의미!
		
//		단, 다음을 주의하자
		int d,e = 10;  
//		System.out.println(d); // 에러
		System.out.println(e); // 10
//		=> 이 경우 바로 앞의 e에만 10이 저장됨.
//		=> 둘 다 10을 저장하고 싶으면 다음과 같이 해야 한다. 
//		int d = 10, e = 10;
//		  혹은, 
//		int d = 10;
//		int e = 10;
		
		
//		5. 변수는 이름 중복이 안됨!
//		char c; // 에러! (int c과 중복)
		
//		6. 값 변경 할 때는 앞에 자료형 붙지 않는다. (자료형을 쓰면 무조건 새 변수의 등장을 의미한다)
//		int c = 100; // 에러!
		
//		7. 자료형이 다른 변수는 저장 불가 
		int n1 = 10;
//		int n2 = 10.0; (X)
//		String str1 = 'A';(X)
//		char ch1 = "C"; (X);
		
		
//		6. 변수명 명명 규칙
//		 ㄱ. 대소문자는 구분된다.(Hello와 HELLO는 다름)
//		 ㄴ. 예약어(키워드)는 변수명으로 지정될 수 없다. *보라색 단어가 예약어
//		 ㄷ. 숫자로 시작할 수 없다.(n1은 되지만 1n은 안된다.)
//		 ㄹ. 특수문자는 '$'와 '_'만 가능
//		 ㅁ. 권장 - 가장 앞 글자는 소문자로 하고, 여러 단어일 경우 단어들의 첫글자를 대문자로 표시한다(카멜 표기법)
//		     e.g. myFirstVar
//		 ㅂ. 최대한 자세하고 정확한 의미가 있으면 좋다. (가독성을 위해. 최대 255글자)
		
	}
}
