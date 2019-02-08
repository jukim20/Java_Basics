package com.javalec.basic;
/*
 * < Math.random() >
 * : 0.0 이상 0.99999999999 이하의 실수 중 1개를 랜덤하게 반환
 *   용도: 랜덤 수 생성, 확률 이벤트 생성
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		double rand = Math.random(); 
		System.out.println(rand); // 실행할 때마다 값이 계속 바뀌지만 무조건 0보다 크고 1보다 작음
		
		// 0 ~ 9 중 1개의 수를 랜덤하게 출력
		System.out.println( (int)(Math.random()*10) );
		
		// 1 ~ 10 중 1개의 수를 랜덤하게 출력
		System.out.println( (int)(Math.random()*10) + 1 );
		
		// 2 ~ 11 중 1개의 수를 랜덤하게 출력
		System.out.println( (int)(Math.random()*10) + 2 );
		
		// 2 ~ 9 중 1개의 수를 랜덤하게 출력
		System.out.println( (int)(Math.random()*8) + 2 );
		// 1)      Math.random()      : 0.0 ~ 0.999999999
		// 2)      Math.random()*8    : 0.0 ~ 7.999999999
		// 3)(int)(Math.random()*8)   : 0 ~ 7
		// 4)(int)(Math.random()*8)+2 : 2 ~ 9
		
		
		// 식 : (int)(Math.random()*개수)+시작수
	}
}

// Quiz01