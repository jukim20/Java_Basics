package com.javalec.com;

/*
 * < while�� do-while�� ���� > 
 *  while    : ���ǽ�-> ���̸� -> ���� -> ���ǽ� -> ���̸� -> ����
 *  do-while : ���� -> ���ǽ� -> ���̸� -> ���� -> ���ǽ� -> ���̸� -> ����
 *   => do-while�� ���ʿ� ���ǽ��� false���� ������ 1�� ���ӹ����� �����Ѵ�.   
 */
public class Test02 {
	public static void main(String[] args) {

		int num = 0;
		while (num == 100) {
			System.out.println("while�� ����ɱ�?");
		}

		do {
			System.out.println("do-while�� ����ɱ�?");
		} while (num == 100);
	}
}