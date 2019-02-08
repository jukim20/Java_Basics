package com.javalec.basic;
/*
 * < static�� Ư¡ 1. �̸� ���������. >
 *  - �츮�� Ŭ������ ��� �޼ҵ峪 ��� ������ ����Ϸ��� ������ ��ü ������ �ؾ� ����� �� �ִٰ� �����.
 *    �׷���... sysout��..? JOptionPane��..? Math.random��..?
 */
class SampleClass {
	String instanceField = "�̰��� �ν��Ͻ�(non-static) ��� ����";
	static String classField = "�̰��� Ŭ����(static) ��� ����";
}
public class Test02 {
	public static void main(String[] args) {
		String str;
		
//		System.out.println(SampleClass.instanceField); // ����!
		System.out.println(SampleClass.classField);
		
//		����: instanceField�� ��ü �����ؾ� �������
		SampleClass sample = new SampleClass();
		System.out.println(sample.instanceField);
		
//		���� : classField ���� ���۷����� ������ ���� ����. ��, ����õ. (Ŭ���� �̸����� �����ϴ� ���� �ٶ���) 
		System.out.println(sample.classField); 
	}
}
