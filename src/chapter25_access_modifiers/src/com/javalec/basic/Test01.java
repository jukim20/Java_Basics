package com.javalec.basic;

import testpackage.AA;

/*
 *  < ����������(=����������) >
 *  - ����� ��������� �����ϴ� Ű���� 
 *  - 4������ �ִ�.
 *   1. public : ������  		| ��ο��� �����ϰڴ�!
 *   2. protected : ��ȣ�޴�    | �ٸ� ��Ű���� �������� �ʴ� ���, �ڽ�Ŭ������� �����ϰڴ�. (�Ҽ� ��Ű�� �ȿ����� ��ο��� ����) => ���� ��� �� ���
 *   3. 		  : default | �Ҽ� ��Ű�� �ȿ����� �����ϰڴ�! (�ٸ� ��Ű�����״� ���� ���� X) => ���� �츮�� ����ߴ� ��!
 *   4. private : ��������        | �� Ŭ���� �ȿ����� �����ϰڴ�! (Ŭ���� �ܺζ�� ���� ���� X)
 *  - ��Ű���� �������� ��������� ��������.
 *  
 *  testpackage.AA�� ������!
 */
public class Test01 {
	public static void main(String[] args) {
		AA p  = new AA();
		System.out.println(p.publicStr);
//		System.out.println(p.protectedStr); // ���� �Ұ�
//		System.out.println(p.defaultStr);	// ���� �Ұ�
//		System.out.println(p.privateStr);	// ���� �Ұ�
		
//		testpackage.Test02�� ����.
	}
}
