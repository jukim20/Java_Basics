package com.javalec.basic;
/*
 * 이런 경우를 위해서도 static을 사용한다.
 * ( 한 개만 만들어진다, 모든 객체가 이를 공유한다.)
 */
class BTeam {
	String name; // 팀원 이름
	static int teamCount; // 전체 팀원 수
//	teamCount를 스태틱으로 선언
	
	void printData() {
		System.out.println("팀원 : " + this.name + "(ATeam의 전체 팀원 수 : " + teamCount + "명)");
	}
}
public class Test05 {
	public static void main(String[] args) {
		BTeam b1 = new BTeam();
		b1.name = "피카츄";
		b1.teamCount = 1; // 전체 팀원은 피카츄 1명
		
		// 꼬부기 팀원 추가 
		BTeam b2 = new BTeam();
		b2.name = "꼬부기";
		b2.teamCount = 2; // 현재 꼬부기 객체에만 2 저장
		
		b1.printData(); // 팀원 : 피카츄(ATeam의 전체 팀원 수 : 2명) <--- !!!!
		b2.printData(); // 팀원 : 꼬부기(ATeam의 전체 팀원 수 : 2명)
		System.out.println();
		
		// 시간이 흘러, 파이리가 팀원으로 들어왔다
		BTeam b3 = new BTeam();
		b3.name = "파이리";
		b3.teamCount = 3; // 현재 파이리 객체에만 3 저장
		
		b1.printData(); // 팀원 : 피카츄(ATeam의 전체 팀원 수 : 3명) <--- !!!!
		b2.printData(); // 팀원 : 꼬부기(ATeam의 전체 팀원 수 : 3명) <--- !!!!
		b3.printData(); // 팀원 : 파이리(ATeam의 전체 팀원 수 : 3명)
		System.out.println();
		
	}
}
