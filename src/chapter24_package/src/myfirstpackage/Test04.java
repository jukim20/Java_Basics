package myfirstpackage;

import com.javalec.basic.Test03; // com부터 Test03까지 다 써야한다.

public class Test04 {
	public static void main(String[] args) {
		// Test03의 메인메소드를 실행해볼까? (참고로 메인메소드는 static이니까 객체 생성 안해도 클래스명.메소드명()으로도 실행 가능)
		
		// 방법1. 클래스 풀네임을 사용하는 방법 
		com.javalec.basic.Test03.main(null);
		
		// 방법2. import 선언하는 방법
		Test03.main(null); 
	}
}

// com.javalec.basic.Test05로 이동하자.
