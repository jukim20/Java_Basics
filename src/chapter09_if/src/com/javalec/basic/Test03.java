package com.javalec.basic;

import java.util.Scanner;

/*
 * < else >
 * - if�� ¦��
 * - �ٷ� �� if���� '()'(���ǽ�)�� false�� ��� ������ ����
 * - ���� : 
 *  	if(���ǽ�){
 *  		// ���ǽ��� true�� ��� ������ ����� (=if�� ���ӹ���)
 *  	} else {
 *  		// ���ǽ��� false�� ��� ������ ����� (=else�� ���ӹ���)
 *  	}
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���̸� �Է��ϼ���.");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("����� �̼����Դϴ�.");
		}
		/*
		 *  else ������
		 *  1. �ٷ� �� ������ if���̾�� �Ѵ�. 
		 *  2. if�� ���� ���������� else�� ����� ���� ����.
		 *  3. else�� '()'(���ǽ�)�� ���� �ʴ´�.
		 *  4. if-else ¦�� �ݵ�� �� �� �ϳ��� ����Ǵ� �����̴�.
		 */

	}
}
