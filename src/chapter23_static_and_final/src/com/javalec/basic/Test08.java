package com.javalec.basic;
/*
 * < final >
 * - 최후의, 변경되지 않는
 * - final은 클래스, 멤버(변수/메소드), 지역변수 앞에 붙일 수 있다.
 *   1) final class : 상속(확장)할 수 없는 => 나중에 배우장
 *   2) final method : 오버라이드 할 수 없는 => 이것도 나중에 배우장 ^^
 *                     (오버로드와 다르다. final method도 오버로드는 가능하다)
 *   3) final field/variable : 변경할 수 없는
 */
public class Test08 {
	public static void main(String[] args) {
		final int a = 1; 
//		a = 10; // 에러!
		
		SampleClass8 sample = new SampleClass8();
		sample.str = "일반 변수는 변경 가능";
//		sample.str2 = "final 변수는 변경 불가능";
//		에러 메세지 : The final field SampleClass8.str2 cannot be assigned (허용되지 않는다!)
	}
}

class SampleClass8 {
	String str = "이것은 일반";
	final String str2 = "이것은 final";
}