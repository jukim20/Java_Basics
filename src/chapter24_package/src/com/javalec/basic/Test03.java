package com.javalec.basic;

// ���2. import ������ �ϴ� ���
// ���� : (Ŭ���� �ٱ���) import �Ҽ���Ű����.Ŭ������;
import myfirstpackage.Person; // myfirstpackage�� �ִ� Person�� import�ϰڴ�! 

// ���� : ��Ű���� ��� Ŭ�������� import�� ��� ������ ���� ����.
import myfirstpackage.*; // '*'�� '���'�� �ǹ��Ѵ�.  
//import myfirstpackage; // ����!

public class Test03 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Test03 ����");
		System.out.println(p);
		// �츮�� ����� �� Scanner�� JOptionPane�� �츮 �ҽ����� ���忡���� �ܺ� ��Ű�� �Ҽ��̱⶧���� 
		// import �ؿ;� ��밡�� �ߴ� ���̴�!
		
		// myfirstpackage.Test04�� �Ѿ��.
	}
}
