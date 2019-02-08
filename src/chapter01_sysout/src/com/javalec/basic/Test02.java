package com.javalec.basic;

public class Test02 {
	public static void main(String[] args) {
		
		// sysout 자동완성 : syso 치고 ctrl + space + enter
		// sysout에 대해 좀더 알아봅시다.
		
//		1. 쌍따옴표는 여러 문자 가능(여러 문자 = 문자열 데이터)
		System.out.println("Hi");
		
//		2. 외따옴표의 경우 1글자만 (한 문자 = 단일문자 데이터)
		System.out.println('H'); 
//		에러 : System.out.println('Hi'); (X) => 두 글자 이상은 반드시 쌍따옴표(")로!
		
//		주의 : 문자를 출력하고자 할 때는 쌍따옴표나 외따옴표를 쳐야 한다.
//		에러 : System.out.println(Hi); (X)
//		에러 : System.out.println(H);  (X)
//		(따옴표를 안친 텍스트는 변수로 인식하기 때문) => 변수는 다음 시간에 배움!
		
//		3. 공백 출력 (엔터만 치는 것과 같음)
		System.out.println(); 
		
//		4. sysout 내부에서의 덧셈
		System.out.println(10 + 20);					// 30
		System.out.println(10 + 20 + "ABC");			// 30ABC
		System.out.println("ABC" + 10 + 20);			// ABC1020
		System.out.println(10 + 20 + "ABC" + 10 + 20);  // 30ABC1020
		System.out.println(10 + 20 + "ABC" + (10 + 20));// 30ABC30
//		덧셈기호(+)의 역할 : 덧셈연산이 가능하다면 덧셈을 하되, 불가능한 경우는 '덧붙여라'는 의미 
//		쌍따옴표(") 데이터 등장 이후의 덧셈기호(+)는 무조건 '덧붙여라'라는 의미로 해석
//		덧셈처리를 하고 싶다면 먼저 계산되도록 소괄호()를 쳐주면 된다.
		
//		< 심화 : 10 + 20 + "ABC" + 10 + 20 이것의 결과가 왜 30ABC1020이 될까? >
//		Hint: 컴퓨터는 연산을 1개씩 밖에 처리하지 못한다. 다만 그 속도가 굉장할 뿐.... 
//		10 + 20 + "ABC" + 10 + 20 여기서 
//		-------> 요게 먼저 연산! 결과는 30
//		   30   + "ABC" + 10 + 20 이 되고, 이번엔
//		---------------> 요게 연산! 결과는 "30ABC" (문자열 한 덩어리가 됨)
//		     "30ABC"    + 10 + 20 이 되고, 이번엔
//		--------------------> 요게 연산! 결과는 "30ABC10" (마찬가지로 문자열 한 덩어리)
//		       "30ABC10"     + 20 이 되고, 마지막으로 
//		-------------------------> 요게 연산! 결과는 "30ABC1020" (최종적으로 문자열 한 덩어리)
//		 ==> 이해가 안되더라도 '자료형' 파트에서 알 수 있으니 걱정 마세요~
		
//		5. 숫자 출력 
		System.out.println(1);  // 숫자로 인식
		System.out.println("1");// 문자열로 인식
		System.out.println('1');// 단일문자로 인식 ==> 이들의 차이? 연산(사칙연산)을 할지 말지.
		System.out.println(1 + 2);   // 3
		System.out.println("1" + 2); // 12
		System.out.println('1' + 2); // 51 
		
//		6. 덧셈을 제외한 연산 ( -, *, / )
		System.out.println(20 - 10);
		System.out.println(20 * 10);
		System.out.println(20 / 10);
		System.out.println(10.2 - 10);
		
//		7. \n과 \t (주의! 슬래시가 아닌 역슬래시)
		System.out.println("-----보기 힘드니까 표시좀ㅋ-----");
		System.out.println("ABC\nDEF");
		System.out.println("GHI\tJKL");
		System.out.println("안녕," + '\n' + "피카츄!"); // \n는 우리에겐 2 글자이지만, 컴퓨터에겐 1 글자로 취급된다.
		
//		8. println이 아닌 print
		System.out.print("MNO");
		System.out.print("PQR");
		System.out.print("STU\n\nVWX"); // 엔터 두 번 친거
		System.out.println("YZ끝!");
//		결론 : println()은 마지막에 자동 엔터 (커서가 다음 줄로 이동)
//		     print는 자동 엔터 아님
//		참고 : C언어의 printf()도 있긴함 (System.out.printf()) 하지만 제약이 몇 가지 있어서 자바에선 사용하지 않음
	}
}

// Quiz.
// 1. chapter02 프로젝트에 com.javalec.quiz 패키지를 만드세요
// 2. 그 패키지에 Quiz02 소스파일을 추가하세요.
// 3. 다음을 출력하세요. (두 줄로 출력)
//  반지름 144인 원의 넓이는 
//  XX.XXXX 입니다.

