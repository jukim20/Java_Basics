package myfirstpackage;

import com.javalec.basic.Test03; // com���� Test03���� �� ����Ѵ�.

public class Test04 {
	public static void main(String[] args) {
		// Test03�� ���θ޼ҵ带 �����غ���? (����� ���θ޼ҵ�� static�̴ϱ� ��ü ���� ���ص� Ŭ������.�޼ҵ��()���ε� ���� ����)
		
		// ���1. Ŭ���� Ǯ������ ����ϴ� ��� 
		com.javalec.basic.Test03.main(null);
		
		// ���2. import �����ϴ� ���
		Test03.main(null); 
	}
}

// com.javalec.basic.Test05�� �̵�����.
