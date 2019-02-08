package com.javalec.basic;

// 3. 증감연산자 : ++, --

public class Test03 {
	public static void main(String[] args) {
		
		// 1. ++ : 변수에 1를 증가하여 다시 저장
		// 2. -- : 변수에 1을 감소하여 다시 저장
		
		int n = 1;
		
		// 증감연산자는 변수 1개의 앞, 혹은 뒤에 쓴다.
		++n;
		System.out.println(n); // 2
		--n;
		System.out.println(n); // 1
		
		n++;
		System.out.println(n); // 2
		--n;
		System.out.println(n); // 1
		
		// 이때 ++/--가 변수 앞에 있으면 '전위연산'(= 전치연산)
		//               뒤에 있으면 '후위연산'(= 후치연산)           
		
		// 전치연산 : 먼저 증/감하고 나머지 명령 수행		
		// 후치연산 : 나머지 명령들 먼저 수행하고 마지막에 증/감
		
		{ // 전치연산 테스트
			int n1;
			int n2 = 1;
			n1 = ++n2; // 전치연산
			System.out.println("n1의 값 : " + n1); // n1의 값 : 2
			System.out.println("n2의 값 : " + n2); // n2의 값 : 2
		}
		
		{ // 후치연산 테스트
			int n1;
			int n2 = 1;
			n1 = n2++; // 후치연산
			System.out.println("n1의 값 : " + n1); // n1의 값 : 1
			System.out.println("n2의 값 : " + n2); // n2의 값 : 2
		}
		
//		Quiz.
//		int data = 10;
//		System.out.println(++data); 
//		System.out.println(data++);
//		System.out.println(data);
//		위 3 줄은 어떻게 출력될까?
	}
}
