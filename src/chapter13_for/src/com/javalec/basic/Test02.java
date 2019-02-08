package com.javalec.basic;

public class Test02 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; ++i) {
			System.out.println(i);
		}
//		System.out.println(i); // 에러!
//		i는 for문 안에 선언되었기 때문에 for문 안에서만 사용가능 (for문 끝나면 없어짐)
		
	}
}
