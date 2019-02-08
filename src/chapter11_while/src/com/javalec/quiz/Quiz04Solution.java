package com.javalec.quiz;

public class Quiz04Solution {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int tmp = 0;
		System.out.print(n1 + " ");
		System.out.print(n2 + " ");
		while(true) {
			tmp = n1 + n2;
			if(tmp > 500) { break; }
			System.out.print(tmp + " ");
			n1 = n2;
			n2 = tmp;
		}
	}
}
