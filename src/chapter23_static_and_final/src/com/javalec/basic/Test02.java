package com.javalec.basic;
/*
 * < static의 특징 1. 미리 만들어진다. >
 *  - 우리는 클래스의 멤버 메소드나 멤버 변수를 사용하려면 무조건 객체 생성을 해야 사용할 수 있다고 배웠다.
 *    그런데... sysout은..? JOptionPane은..? Math.random은..?
 */
class SampleClass {
	String instanceField = "이것은 인스턴스(non-static) 멤버 변수";
	static String classField = "이것은 클래스(static) 멤버 변수";
}
public class Test02 {
	public static void main(String[] args) {
		String str;
		
//		System.out.println(SampleClass.instanceField); // 에러!
		System.out.println(SampleClass.classField);
		
//		참고: instanceField는 객체 생성해야 만들어짐
		SampleClass sample = new SampleClass();
		System.out.println(sample.instanceField);
		
//		참고 : classField 또한 레퍼런스로 접근할 수는 있음. 단, 비추천. (클래스 이름으로 접근하는 것이 바람직) 
		System.out.println(sample.classField); 
	}
}
