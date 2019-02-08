package com.javalec.basic;
/*
 * < 한 개만 만들어진다. > 
 *  => 같은 타입의 모든 객체가 이거 하나를 공용으로 사용한다. (공유폴더 같은 역할)
 *  => 객체들이 공통으로 가지고 있어야 할 정보가 있을 때 static을 사용한다.
 */
class ATeam {
	String name; // 팀원 이름
	int teamCount; // 전체 팀원 수
	
	void printData() {
		System.out.println("팀원 : " + this.name + "(ATeam의 전체 팀원 수 : " + this.teamCount + "명)");
	}
}
public class Test04 {
	public static void main(String[] args) {
		ATeam a1 = new ATeam();
		a1.name = "피카츄";
		a1.teamCount = 1; // 전체 팀원은 피카츄 1명
		
		// 꼬부기 팀원 추가 
		ATeam a2 = new ATeam();
		a2.name = "꼬부기";
		a2.teamCount = 2; // 전체 팀원은 현재 두명
		
		// 하지만! 피카츄 입장에서는 아직 teamCount가 1명이다.
		a1.printData(); // 팀원 : 피카츄(ATeam의 전체 팀원 수 : 1명)
		a2.printData(); // 팀원 : 꼬부기(ATeam의 전체 팀원 수 : 2명)
		System.out.println();
		
		// 따라서 a1에도 팀원 수를 2명으로 저장해야 한다.
		a1.teamCount = 2;
		
		// 시간이 흘러, 파이리가 팀원으로 들어왔다
		ATeam a3 = new ATeam();
		a3.name = "파이리";
		a3.teamCount = 3; // 전체 팀원이 3명이 됨.
		
		// 하지만! 아까와 같은 이유로 피카츄, 꼬부기 입장에서는 TeamCount가 2명이다.
		a1.printData(); // 팀원 : 피카츄(ATeam의 전체 팀원 수 : 2명)
		a2.printData(); // 팀원 : 꼬부기(ATeam의 전체 팀원 수 : 2명)
		a3.printData(); // 팀원 : 파이리(ATeam의 전체 팀원 수 : 3명)
		System.out.println();
		
		// 피카츄와 꼬부기 입장에서도 전체 팀원은 세명이 되어야 한다.
		a1.teamCount = 3;
		a2.teamCount = 3;

		a1.printData(); // 팀원 : 피카츄(ATeam의 전체 팀원 수 : 3명)
		a2.printData(); // 팀원 : 꼬부기(ATeam의 전체 팀원 수 : 3명)
		a3.printData(); // 팀원 : 파이리(ATeam의 전체 팀원 수 : 3명)
		System.out.println();
		
		// 이 이야기는 이후에 팀원이 새로 추가될 때 마다 
		// 모든 객체의 teamCount를 일일히 수정해야 한다는 의미이다!!
	}
}
