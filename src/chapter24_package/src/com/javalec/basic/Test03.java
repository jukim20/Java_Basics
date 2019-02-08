package com.javalec.basic;

// 방법2. import 선언을 하는 방법
// 형식 : (클래스 바깥에) import 소속패키지명.클래스명;
import myfirstpackage.Person; // myfirstpackage에 있는 Person을 import하겠다! 

// 참고 : 패키지의 모든 클래스들을 import할 경우 다음과 같이 쓴다.
import myfirstpackage.*; // '*'은 '모두'를 의미한다.  
//import myfirstpackage; // 에러!

public class Test03 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Test03 실행");
		System.out.println(p);
		// 우리가 사용해 온 Scanner와 JOptionPane도 우리 소스파일 입장에서는 외부 패키지 소속이기때문에 
		// import 해와야 사용가능 했던 것이다!
		
		// myfirstpackage.Test04로 넘어가자.
	}
}
