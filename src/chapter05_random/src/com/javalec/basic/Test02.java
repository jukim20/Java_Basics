package com.javalec.basic;

public class Test02 {
	public static void main(String[] args) {
		// 20%의 확률로 "레어템 등장~"을 출력 / 아니면 "일반 아이템 등장~"을 출력
		double rand = Math.random();
		System.out.println("rand : " + rand);
		System.out.println( rand < 0.2 ? "레어템 등장!" : "일반템 등장~");
	}
}

// Quiz02
