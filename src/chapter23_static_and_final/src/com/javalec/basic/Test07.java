package com.javalec.basic;
/* 
 * 번외 : args란 무엇인가..? ㅜ.ㅜ?
 */
public class Test07 {
	public static void main(String[] args) {
		System.out.println("[args란..]");
		for(int i = 0; i<args.length; ++i) {
			System.out.println(i + "번 인자 : " + args[i]);
		}
		// 이건 이클립스에서는 실행하면 결과가 보이지 않는다.
		// cmd로 실행해야 한다. (과정이 복잡하니 눈으로만 봐도 된다.)
		
//		 0. CMD 열고
//		 1. chapter23_static_final 프로젝트 폴더로 이동
//		 2. java com/javalec/basic/Test07 메롱 피카츄 11 22 33 ㅋㅋ (입력 후 엔터)
//		    - java : 실행하라 
//		    - com/javalec/basic/Test07 프로그램을
//		    - 옵션(=인자값)을 메롱, 피카츄, 11, 22, 33, ㅋㅋ 이렇게 6개 넣고
//		 결과 : 
//			[args란..]
//			0번 인자 : 메롱
//			1번 인자 : 피카츄
//			2번 인자 : 11
//			3번 인자 : 22
//			4번 인자 : 33
//			5번 인자 : ㅋㅋ
//		for문을 통해 들어온 인자값들이 모두 출력되는 것을 알 수 있다.
//		메인메소드의 매개변수 args는 cmd로 프로그램을 실행할 때 추가로 넣는 값들을 String배열로 담아 메인메소드에 전달하는 역할을 한다.
//		만약 여러분이 ping 8.8.8.8 이라던지, ipconfig /all 등의 명령을 본 적이 있다면
//		명령 다음에 나오는 8.8.8.8이나 /all, ./Desktop이 파라미터(인자)라는 것을 알고 있을 것이다.
//		이들은 ping.exe이란 프로그램의 메인함수에 8.8.8.8이라는 인자를 넣겠다는 의미,
//		ipconfig.exe이란 프로그램의 메인함수에 /all이라는 인자를 넣겠다는 의미이다. 
//		이렇듯 프로그램을 실행할 때 인자값을 같이 넣고 실행하는 경우도 있기 때문에, 
//		이를 대비하여 메인메소드에는 매개변수가 존재한다.
	}
}







