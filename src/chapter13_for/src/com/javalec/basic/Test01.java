package com.javalec.basic;
/*
 * < for문 >
 * - 형식 : 
 *  for(초기식;조건식;증감식){
 *  	// 조건식이 true일 동안 실행할 명령들
 *  }
 * - 순서 : 
 *  초기식 -> 조건식 -> true면 -> 종속문장 -> 증감식
 *  -> 조건식 -> true면 -> 종속문장 -> 증감식
 *  -> 조건식 -> true면 -> 종속문장 -> 증감식
 *  -> ...
 *  -> 조건식 -> false면 -> for문 끝
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		int i;
		for(i=0; i<=10; ++i) {
			System.out.println(i);
		}
	}
}
