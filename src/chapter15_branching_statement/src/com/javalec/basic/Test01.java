package com.javalec.basic;
/*
 * < 분기문(branching statements) >
 *  - 흐름을 끊거나 이동시키는 제어문
 *  - 종류 : break, continue, return
 *  
 * < break > 
 *  - switch문, 반복문(while, do-while, for)을 '종료'하는 키워드
 *    (if를 종료하지 않는다.) 
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("break test");
		for(int i = 10; i >= 1; --i) {
			if(i % 4 ==0) { // i가 4의 배수라면
				break; 
			}
			System.out.println(i);
		}
		
		/*
		 	< 출력 >
		 	break test
			10
			9
		 */
	}
}
