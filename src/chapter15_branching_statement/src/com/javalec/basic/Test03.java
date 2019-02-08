package com.javalec.basic;
/*
 * < return > 
 *  - 메소드를 종료하라.
 *  - 아직 우리가 메소드를 공부하지 않았지만
 *    메소드의 일종인 메인메소드는 알고 있다. 
 *    메인 메소드에 들어있는 return은 메인메소드를 종료하는 역할을 한다.
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println("return test");
		for(int i = 10; i >= 1; --i) {
			if(i % 4 ==0) { // i가 4의 배수라면
				return; // 메인메소드를 종료하라 (결국 프로그램을 종료하라는 의미)
//				break;  
			}
			System.out.println(i);
		}
		System.out.println("return을 쓰면 이 문장은 출력되지 않는다!");
		
		/*
	 	< 출력(1) return일 경우 >
	 	return test
		10
		9
		
		< 출력(2) break일 경우 >
		return test
		10
		9
		return을 쓰면 이 문장은 출력되지 않는다! <= 킬링파트!!!!
		
	 	*/
	}
}








