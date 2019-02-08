package com.javalec.quiz;

import java.util.Scanner;

public class Quiz03Solution {
	public static void main(String[] args) {
		
		String vipId = "pika";
		String vipPw = "pika1234";
		String message = null;
		
		String id, pw;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 딸기 사세용! ===");
		System.out.print("ID:");
		id = sc.next();
		System.out.print("PW:");
		pw = sc.next();
		
		message = (id.equals(vipId) && pw.equals(vipPw)) ? "현재 고객님은 VIP이십니다. 20% 할인 적용하여 1600원입니다. ":"현재 고객님은 일반 고객이십니다. 2000원입니다.";
		System.out.println(message);
	}
}
