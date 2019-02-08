package com.javalec.basic;

import java.util.Scanner;

/*
 * < else if�� (��ø if��) >
 * - if�� else�� ��ģ ��
 * - ���ǽ��� ���� �� ���� ���� �� 
 *   e.g. ����/�̼��� ���� �ʵ�/�ߵ�/����л��� �Ǻ��ϰ� ���� ��
 * - ���� : 
 *		if(���ǽ�1){
 *  		// ���ǽ��� true�� ��� ������ ����� (=if�� ���ӹ���)
 *  	} else if(���ǽ�2) {
 *  		// ���� if�� ���ǽ�(���ǽ�1)�� ��� false, ���ǽ�2�� true�� ��� ������ ����� (=else if�� ���ӹ���)
 *  	} else if(���ǽ�3) {
 *  		// ���� if�� ���ǽ�(���ǽ�1, ���ǽ�2)�� ��� false, ���ǽ�3�� true�� ��� ������ ����� (=else if�� ���ӹ���)
 *  	} else if(���ǽ�4) {
 *  		// ���� if�� ���ǽ�(���ǽ�1, ���ǽ�2, ���ǽ�3)�� ��� false, ���ǽ�4�� true�� ��� ������ ����� (=else if�� ���ӹ���)
 *  	} else { // �־ �ǰ� ��� ��.
 *  		// ���� ��� ���ǽ��� false�� ��� ������ ���� 
 *  		// ** ���� ���� ����..
 *      }
 *      
 * - �� else ���� �ٷ� �� ���� if���� ¦�� ���̴�. 
 *   �� 13�� ° ���� else�� 11�� �� if�� ¦��
 *     15�� ° ���� else�� 13�� �� if�� ¦��
 *     17�� ° ���� else�� 15�� �� if�� ¦��
 *     19�� ° ���� else�� 17�� �� if�� ¦��
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.print("���� : ");
		age = sc.nextInt();
		
		if(age <= 8) {
			System.out.println("������ �Ƶ�");
		} else if(age <= 13) {
			System.out.println("�ʵ��л�");
		} else if(age <= 16) {
			System.out.println("���л�");
		} else if(age <= 19) {
			System.out.println("����л�");
		} else {
			System.out.println("����(���л�)");
		}
		
//		����! JVM�� ���ǽĵ��� ���������� Ȯ���ϱ� ������ ó�� true�� ���� if�� �����. 
//		e.g. 12���� �Է� ���� ��, ��� 15�� 13����, 16����, 19���Ͽ� ��� true������
//		         �� ó�� �ɸ��� 13���ϸ� �����.
		
//		����! if ~ else (Ȥ�� ������ else if)�� 1��Ʈ�̴�. 
//				=> �̵� �� 1���� �����Ѵ�.
	}
}





