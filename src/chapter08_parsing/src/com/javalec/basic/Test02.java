package com.javalec.basic;
/*
 * < Parsing >
 * - �����м�
 * - String -> int ( "22" -> 22 )
 *   String -> double ( "3.14" -> 3.14 )
 *   String -> boolean ( "true" -> true ) ��, '���ڿ�'�� �ٸ� ������ �����ͷ� ��ȯ�ϴ� ���� ���Ѵ�. 
 *                                            --------------------------
 * - ��� : 
 *    ���ڿ��� int�� : �������� = Integer.parseInt(���ڿ�);
 *                  e.g. int num = Integer.parseInt("10");
 *                  			 = Integer.parseInt("-1000");
 *                  	         = Integer.parseInt(sAge); // (�̶� sAge�� ���ڿ� ����)
 *                  (����: int num = Integer.parseInt("10.0"); // ����! ('.'�� �ν����� ����)
 *                  
 *    ���ڿ��� double�� : �Ǽ����� = Double.parseDouble(���ڿ�);
 *                  e.g. double num = Double.parseDouble("10.0");
 *                  	            = Double.parseDouble(sHeight); // (�̶� sHeight�� ���ڿ� ����)
 *    �� �ܿ��� ������ 5���� �����ڷ����� ���� �Ľ� ��ɾ �ִ�.
 *    Byte.parseByte(���ڿ�)
 *    Short.parseShort(���ڿ�)
 *    Long.parseLong(���ڿ�)
 *    Float.parseFloat(���ڿ�)
 *    Boolean.parseBoolean(���ڿ�)
 *    ** Char.parseChar(���ڿ�)�� ����.
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
