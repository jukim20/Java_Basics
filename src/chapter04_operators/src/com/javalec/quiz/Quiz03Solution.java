package com.javalec.quiz;

import java.util.Scanner;

public class Quiz03Solution {
	public static void main(String[] args) {
		
		String vipId = "pika";
		String vipPw = "pika1234";
		String message = null;
		
		String id, pw;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== ���� �缼��! ===");
		System.out.print("ID:");
		id = sc.next();
		System.out.print("PW:");
		pw = sc.next();
		
		message = (id.equals(vipId) && pw.equals(vipPw)) ? "���� ������ VIP�̽ʴϴ�. 20% ���� �����Ͽ� 1600���Դϴ�. ":"���� ������ �Ϲ� ���̽ʴϴ�. 2000���Դϴ�.";
		System.out.println(message);
	}
}
