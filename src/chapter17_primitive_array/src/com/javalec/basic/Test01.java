package com.javalec.basic;
/*
 * < 배열(Arrays) >
 * - '같은 자료형' 데이터를 '여러 개' 저장할 수 있는 메모리 
 * - 변수-> 서랍 1칸
 *   배열-> 서랍장
 * - 주의 : 같은 자료형 데이터만 저장할 수 있다.
 * - [] : 배열
 * - 배열 안에 들어가는 데이터를 배열의 원소(elements)라고 한다. 
 * - 중요! 배열은 99% for문과 함께 사용된다!
 */
public class Test01 {
	public static void main(String[] args) {
		// int형 데이터 (10,20,30,40,50)을 저장할 5칸짜리 배열 1개 생성
		
		int[] arr1; // int형 배열의 주소를 저장할 arr1 참조변수 선언
		arr1 = new int[5]; // int형 5칸짜리 배열을 생성하고(new) 그 주소를 arr1에 저장
		
		arr1[0] = 10; // arr1 배열의 0번 칸에 10을 저장(칸 번호(인덱스)는 0번부터 시작한다.)
		arr1[1] = 20; // arr1 배열의 1번 칸에 20을 저장
		arr1[2] = 30; // arr1 배열의 2번 칸에 30을 저장
		arr1[3] = 40; // arr1 배열의 3번 칸에 40을 저장
		arr1[4] = 50; // arr1 배열의 4번 칸에 50을 저장
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
//		System.out.println(arr1[5]); // 에러!
//		  => 0번부터 시작하므로 4번칸까지 있다. 
//		  => ArrayIndexOutOfBoundsException는
//			 배열의 범위를 벗어났다는 의미이므로 알아두자. 
		
//		배열은 생성 시 자동 0으로 초기화 
		int[] arr2 = new int[3];
		System.out.println(arr2[0]); // 0
		System.out.println(arr2[1]); // 0
		System.out.println(arr2[2]); // 0
		
		
		
	}
}
