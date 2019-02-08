package com.javalec.basic;
/*
 * < 레퍼런스 배열 >
 * - 인스턴스를 여러 개 생성하여 하나의 배열에 담기
 * - 학생 100명의 정보와 같은 데이터는 인스턴스 100개가 필요함
 */
class Pokemon {
	String name;
	String skill;
	int level;
}
public class Test01 {
	public static void main(String[] args) {
		Pokemon[] pArr; // Pokemon 타입 배열의 주소를 저장할 pArr 변수 선언 
		pArr = new Pokemon[100]; 
//		주의! 메모장 100장이 생성됨 (인스턴스 100개가 만들어지는 것이 아님)
//		따라서 다음 코드는 에러
//		pArr[0].name = "피카츄"; // NullPointerException
//	 	  => 배열은 생성 시 자동으로 0으로 초기화되기 때문에, 레퍼런스배열 또한 모든 메모장이 null로 초기화
//		     null.name = "피카츄"; 와 같은 의미가 된다.
//		따라서 인스턴스 생성 또한 따로 해야 한다.
		for(int i = 0; i < pArr.length; ++i) {
			pArr[i] = new Pokemon();
		}
		
		pArr[0].name = "피카츄"; // pArr의 0번 인스턴스의 name 멤버에 "피카츄"를 저장
		System.out.println(pArr[0].name);
	}
}






