package com.javalec.basic;
/*
 * < �迭(Arrays) >
 * - '���� �ڷ���' �����͸� '���� ��' ������ �� �ִ� �޸� 
 * - ����-> ���� 1ĭ
 *   �迭-> ������
 * - ���� : ���� �ڷ��� �����͸� ������ �� �ִ�.
 * - [] : �迭
 * - �迭 �ȿ� ���� �����͸� �迭�� ����(elements)��� �Ѵ�. 
 * - �߿�! �迭�� 99% for���� �Բ� ���ȴ�!
 */
public class Test01 {
	public static void main(String[] args) {
		// int�� ������ (10,20,30,40,50)�� ������ 5ĭ¥�� �迭 1�� ����
		
		int[] arr1; // int�� �迭�� �ּҸ� ������ arr1 �������� ����
		arr1 = new int[5]; // int�� 5ĭ¥�� �迭�� �����ϰ�(new) �� �ּҸ� arr1�� ����
		
		arr1[0] = 10; // arr1 �迭�� 0�� ĭ�� 10�� ����(ĭ ��ȣ(�ε���)�� 0������ �����Ѵ�.)
		arr1[1] = 20; // arr1 �迭�� 1�� ĭ�� 20�� ����
		arr1[2] = 30; // arr1 �迭�� 2�� ĭ�� 30�� ����
		arr1[3] = 40; // arr1 �迭�� 3�� ĭ�� 40�� ����
		arr1[4] = 50; // arr1 �迭�� 4�� ĭ�� 50�� ����
		
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
//		System.out.println(arr1[5]); // ����!
//		  => 0������ �����ϹǷ� 4��ĭ���� �ִ�. 
//		  => ArrayIndexOutOfBoundsException��
//			 �迭�� ������ ����ٴ� �ǹ��̹Ƿ� �˾Ƶ���. 
		
//		�迭�� ���� �� �ڵ� 0���� �ʱ�ȭ 
		int[] arr2 = new int[3];
		System.out.println(arr2[0]); // 0
		System.out.println(arr2[1]); // 0
		System.out.println(arr2[2]); // 0
		
		
		
	}
}
