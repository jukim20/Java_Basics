package com.javalec.basic;

import java.util.Scanner;

/*
 * < Scanner > 
 *  - 입력 받은 데이터를 가져올 객체(심부름꾼)
 *  - 입력 스트림의 데이터를 scan하는 역할
 *  - 당분간은 콘솔 입력용으로 사용
 *  - 자동완성 : Scan -> ctrl + space + enter
 *    (자동완성을 해야 위의 import ...도 자동완성 된다.)
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// - Scanner 심부름꾼 생성 + 이름을 sc로 지음 (자세한 의미는 차차 알아볼 것임)
		// - 이름(sc)는 자유롭게 지을 수 있음 (변수명임)
		// - 콘솔창에 데이터를 입력 받는 프로그램은, 이 Scanner가 있어야 함
		//   맨 윗 줄에 미리 써두는 것이 보기 깔끔함
		
		System.out.println("이름을 입력하세요..");
		String name = sc.next(); // 입력 받은 데이터를 String으로 인식해서 이를 name에 저장하라!
		// 입력 받을 데이터가 String이라면 sc.next()

		
		System.out.println("나이를 입력하세요..");
		int age = sc.nextInt(); // 입력 받은 데이터를 int로 인식해서 이를 age에 저장하라!
		// 입력 받을 데이터가 int이라면 sc.nextInt()
		
		System.out.println("키를 입력하세요..");
		double height = sc.nextDouble(); // 입력 받은 데이터를 double으로 인식해서 이를 height에 저장하라!
		// 입력 받을 데이터가 double이라면 sc.nextDouble()
		
//		그외 nextBoolean(), nextByte(), nextFloat() 등 많은 기능들이 있지만 
//		우리는 주로 위 세 기능들만 사용할 것임
		
		System.out.println("=======입력된 데이터========");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		
//		참고 : 한글 입력할 때는 콘솔창 한 번 클릭하기
//		주의 : nextInt()라면 정수만 입력할 것 
//		      nextDouble()라면 정수, 실수만 입력할 것
		
		
	}
}
