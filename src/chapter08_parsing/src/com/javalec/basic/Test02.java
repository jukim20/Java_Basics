package com.javalec.basic;
/*
 * < Parsing >
 * - 구문분석
 * - String -> int ( "22" -> 22 )
 *   String -> double ( "3.14" -> 3.14 )
 *   String -> boolean ( "true" -> true ) 등, '문자열'을 다른 형태의 데이터로 변환하는 것을 말한다. 
 *                                            --------------------------
 * - 방법 : 
 *    문자열을 int로 : 정수변수 = Integer.parseInt(문자열);
 *                  e.g. int num = Integer.parseInt("10");
 *                  			 = Integer.parseInt("-1000");
 *                  	         = Integer.parseInt(sAge); // (이때 sAge은 문자열 변수)
 *                  (주의: int num = Integer.parseInt("10.0"); // 에러! ('.'을 인식하지 못함)
 *                  
 *    문자열을 double로 : 실수변수 = Double.parseDouble(문자열);
 *                  e.g. double num = Double.parseDouble("10.0");
 *                  	            = Double.parseDouble(sHeight); // (이때 sHeight는 문자열 변수)
 *    그 외에도 나머지 5가지 원시자료형에 대한 파싱 명령어가 있다.
 *    Byte.parseByte(문자열)
 *    Short.parseShort(문자열)
 *    Long.parseLong(문자열)
 *    Float.parseFloat(문자열)
 *    Boolean.parseBoolean(문자열)
 *    ** Char.parseChar(문자열)은 없다.
 *    
 */
public class Test02 {
	public static void main(String[] args) {
		String data = "10";
		System.out.println(data + 1); // 101
		
//		int num = (int)data; (X)
		int num = Integer.parseInt(data);
		System.out.println(num + 1); // 11
	}
}
