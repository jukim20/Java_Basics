package com.javalec.basic;
class SampleClass2 {
	String instanceField = "�̰��� �ν��Ͻ�(non-static) ��� ����";
	static String classField = "�̰��� Ŭ����(static) ��� ����";
	
	void instanceMethod() {
		System.out.println("�ν��Ͻ�(non-static) �޼ҵ� ����!");
		System.out.println(instanceField);
		System.out.println(classField);
	}
	
	static void classMethod() {
		System.out.println("Ŭ����(static) �޼ҵ� ����!");
//		System.out.println(instanceField); // ����!
//		���� : static �޼ҵ忡���� static ����� ����� �� �ִ�. ���ϱ�???
		System.out.println(classField);
	}
}
public class Test03 {
	public static void main(String[] args) {
		// �޼ҵ� ����, static ������ �� Ŭ���� �޼ҵ��� ��� 
		// ��ü ���� ���ص� �ȴ�.
		SampleClass2.classMethod();
		
//		Math�� ġ�� '.'�� ��������. �� �� �ߴ� ����� ���캸��
//		�����ܿ� �۰� 's'�� ������ ���̴�. static�̶�� �ǹ��̴�.
		
	}
}
