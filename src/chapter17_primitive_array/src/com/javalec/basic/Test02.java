package com.javalec.basic;
/*
 * < 배열의 여러가지 선언 방법 >
 */
public class Test02 {
	public static void main(String[] args) {
		// 방법1.
		double[] arr1;
		arr1 = new double[3];
		arr1[0] = 1.1;
		arr1[1] = 2.2;
		arr1[2] = 3.3;
		
		// 방법2.
		double[] arr2;
		arr2 = new double[] {1.1, 2.2, 3.3}; 
		
		// 방법3.
		double[] arr3 = {1.1, 2.2, 3.3};
//		double[] arr3;
//		arr3 = {1.1, 2.2, 3.3}; 
//		  => 에러! (선언과 동시에 초기화만 가능하다.)
		
//		배열의 참조변수는 다음과 같은 형태 또한 허용한다.
//		double[] arr4;
		double arr4[];
	}
}
