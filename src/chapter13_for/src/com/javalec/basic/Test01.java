package com.javalec.basic;
/*
 * < for�� >
 * - ���� : 
 *  for(�ʱ��;���ǽ�;������){
 *  	// ���ǽ��� true�� ���� ������ ��ɵ�
 *  }
 * - ���� : 
 *  �ʱ�� -> ���ǽ� -> true�� -> ���ӹ��� -> ������
 *  -> ���ǽ� -> true�� -> ���ӹ��� -> ������
 *  -> ���ǽ� -> true�� -> ���ӹ��� -> ������
 *  -> ...
 *  -> ���ǽ� -> false�� -> for�� ��
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		int i;
		for(i=0; i<=10; ++i) {
			System.out.println(i);
		}
	}
}
