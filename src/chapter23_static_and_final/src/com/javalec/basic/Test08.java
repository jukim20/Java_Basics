package com.javalec.basic;
/*
 * < final >
 * - ������, ������� �ʴ�
 * - final�� Ŭ����, ���(����/�޼ҵ�), �������� �տ� ���� �� �ִ�.
 *   1) final class : ���(Ȯ��)�� �� ���� => ���߿� �����
 *   2) final method : �������̵� �� �� ���� => �̰͵� ���߿� ����� ^^
 *                     (�����ε�� �ٸ���. final method�� �����ε�� �����ϴ�)
 *   3) final field/variable : ������ �� ����
 */
public class Test08 {
	public static void main(String[] args) {
		final int a = 1; 
//		a = 10; // ����!
		
		SampleClass8 sample = new SampleClass8();
		sample.str = "�Ϲ� ������ ���� ����";
//		sample.str2 = "final ������ ���� �Ұ���";
//		���� �޼��� : The final field SampleClass8.str2 cannot be assigned (������ �ʴ´�!)
	}
}

class SampleClass8 {
	String str = "�̰��� �Ϲ�";
	final String str2 = "�̰��� final";
}