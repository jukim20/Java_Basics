package com.javalec.basic;
/*
 * < ������ ������(scope) >
 * - ���� ��� ������ '��������(local variable)'��� �Ѵ�. (������ ��������, �Ű�����, ��������� ���еȴ�.)
 * - �̷��� ���������� ��� ����(�߰�ȣ,'{}')���� ���ٰ��� �� ���� �ƴϴ�.
 *   ���������� �ڽ��� ��� �����ȿ��� ����Ǿ������� ���� ����Ǵ� ������ �����Ѵ�.
 *   (�̴� ���� ��� ���� �Ӹ� �ƴ϶� ������ ������ �迭, �޼ҵ�, Ŭ���� �� ��� �ĺ��ڵ� �ش�ȴ�.)
 *   �̷��� ���� ������ ��������� �Ѵ�.
 * - ������ ����� ������ �� ���� �����̴�.
 * - ������ �ڽ��� ���� ������ ���۵Ǹ�('{') �¾��, 
 *   				      ������ ������('}') �Ҹ�ȴ�. (��ǥ �鸸��)
 */
public class Test04 {
	public static void main(String[] args) {
		
		int a = 10;
		{ // ���� �޼ҵ� ���� �Ǵٸ� ���� ���� (�ǹ̴� ���� �׽�Ʈ�� ����..)  
			int b = 20;
			
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); // ����! (b�� ���������)
		
	}
}