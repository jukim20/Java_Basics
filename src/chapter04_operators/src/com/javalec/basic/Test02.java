package com.javalec.basic;

// 2-1. 대입연산자 : =
// 2-2. 복합대입연산자 : +=, -=, *=, /=, %=
public class Test02 {

	public static void main(String[] args) {
		
		int n1;
		
//		1. 대입연산자 : =	
//		 '='는 같다는 표현이 아니고 '저장하라'는 의미이다. 
//		 형식 : 저장될메모리 = 저장할데이터 
//		 주의 : 앞뒤 순서 주의
		
		n1 = 10;
//		에러 : 10 = n1; // n1을 10에 저장하라? 
		
		int a = 10, b = 20; 
//		a = b와 b = a는 다르다.
		
//		a = b; 
//		System.out.println(a); // 20
//		System.out.println(b); // 20
		
		b = a;
		System.out.println(a); // 10
		System.out.println(b); // 10
		
//		2. 복합대입연산자 : +=, -=, *=, /=, %=
//		+= : 더해서 다시 저장 ( a += b ===> a + b 한 값을 a에 저장 )
//		-= : 빼서 다시 저장    ( a -= b ===> a - b 한 값을 a에 저장 )
//		*= : 곱해서 다시 저장 ( a *= b ===> a * b 한 값을 a에 저장 )
//		/= : 나눠서 다시 저장 ( a /= b ===> a / b 한 값을 a에 저장 )
//		%= : 나머지를 다시 저장( a %= b ===> a % b 한 값을 a에 저장 )
		
		int c = 100, d = 200;
		System.out.println(c + d);
		System.out.println(c); // 100
		
		System.out.println(c += d); // 이때 c + d의 값이 c에 저장되면서 c의 값이 바뀜
		System.out.println(c); // 300
		
//		Quiz.
//		System.out.println(c += 100);
//		System.out.println(c /= 3);
//		System.out.println(c *= 2);
//		System.out.println(c %= 3);
//		System.out.println(c);
//		위 5 줄은 어떻게 출력될까? (c는 300인 상태이다.)
	}
}
