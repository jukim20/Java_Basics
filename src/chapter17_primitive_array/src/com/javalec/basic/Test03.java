package com.javalec.basic;
/*
 * < 배열과 for문 >
 */
public class Test03 {
	public static void main(String[] args) {
		double[] numbers = {100.0, 200.0, 300.0, 400.0};
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		위 코드는 반복문으로 구현할 수 있다.
		
		for(int i = 0; i<4; ++i) { // i:0,1,2,3
			System.out.println(numbers[i]);
		}
		System.out.println();
		
//		배열명.length : 그 배열의 칸 개수(int)
		for(int i = 0; i<numbers.length; ++i) { // 위 for문보다 이 for문이 효율적이다.
			System.out.println(numbers[i]);
		}
		System.out.println();
		
//		확장 for문(foreach문) : 배열과 나중에 배울 컬렉션에 사용되는 특수 for문
//		형식 : 
//			for(임시변수 선언 : 대상 배열명){
//				// 반복할 문장들 (임시변수를 사용)
//			}
		for(double num : numbers) {
			System.out.println(num);
		}
		System.out.println();
		/*
		 * 원리 : 
		 *  배열에 있는 모든 원소들을 한 차례씩 임시변수에 저장하면서 
		 *  반복할 문장을 수행한다. 
		 * 주의! 확장 for문은 배열의 원소를 직접적으로 변경할 수 없다.
		 *      원소를 바꾸려면 일반 for문을 사용해야 한다.
		 */
	}
}












