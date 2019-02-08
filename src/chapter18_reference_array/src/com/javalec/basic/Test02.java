package com.javalec.basic;
/*
 * < 확장 for문 사용 시 주의점 >
 */
public class Test02 {
	public static void main(String[] args) {
		
		Pokemon[] pok = { new Pokemon(), new Pokemon(), new Pokemon() }; 
		
		pok[0].name = "피카츄";
		pok[0].level = 20;
		pok[0].skill = "백만볼트 공격";
		
		pok[1].name = "피카츄";
		pok[1].level = 10;
		pok[1].skill = "천만볼트 공격";
		
		pok[2].name = "파이리";
		pok[2].level = 5;
		pok[2].skill = "회오리 불꽃";
		
		for(int i = 0; i < pok.length; ++i) {
			System.out.println("====<" + (i+1) + "번 포켓몬 정보>====");
			System.out.println("이름 : " + pok[i].name);
			System.out.println("레벨 : " + pok[i].level);
			System.out.println("기술 : " + pok[i].skill);
			System.out.println();
		}
		
		for(Pokemon p : pok) {
			p.name = "없음";
		}
		// 어떻게 될까?
		System.out.println(pok[0].name); // 없음
		System.out.println(pok[1].name); // 없음
		System.out.println(pok[2].name); // 없음
	}
}








