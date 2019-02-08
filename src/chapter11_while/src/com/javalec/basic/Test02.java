package com.javalec.basic;

public class Test02 {
	public static void main(String[] args) {
		int n = 0;
		while(n<=10) {
			System.out.println(n);
			++n; // 1씩 증가
		}
		// 주의! n에는 최종적으로 11이 저장된다.
		System.out.println("최종 n : " + n);
	}
}
// Quiz01.java