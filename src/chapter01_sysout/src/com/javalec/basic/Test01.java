package com.javalec.basic; // ���� : �ڵ����� �ۼ��Ǵ� �� �κ��� �ǵ��� ������!

// ù �ڹ� �ڵ带 �ۼ��غ��ô�!

// 1. �ҽ� ���� ����� ( .java)
//  ���� : 
//	public class Ŭ������ {
//
// 		public static void main(String[] args){
//			���ɹ�1;
//			���ɹ�2;
//			���ɹ�3;	
//			...
//		}
//	}

//	< �ҽ����� �ۼ� �� ���ǻ��� >
//	1) Ŭ�������� �ҽ����ϸ��� �����ϰ�, ��ҹ��ڵ� �Ȱ��� �ۼ��ؾ� �Ѵ�.
//  2) �޸������� �ۼ��� ���, ���� �� �ݵ�� ���� ������ '��� ����'�� �����ؾ� �ϸ�, 
//     Ȯ���ڴ� .java�� �Ѵ�. 
//		('��� ����'�� �������� ���� ���, ���ϸ�.java.txt ��� �ؽ�Ʈ ������ �ǹǷ� ��������!)
//  3) �̸���(�ҽ�����, Ŭ����)�� ���⸦ �� �� ����.
//  4) Ŭ�������� ���� �� �� ���ڸ� �빮�ڷ� �Ѵ�. (�ڹ��� ��Ģ �� �ϳ��̴�.)
//	5) ���� �ҽ��ڵ带 �����ߴٸ� �̸� �������ؼ� �����ؾ� �Ѵ�.

// 2. ������ �ϱ� ( .class ���� �����ϱ�)
//  ���� : (cmd����) javac �ҽ����ϸ�.java
//  e.g. javac MyFirstJava.java
//
// < ������ �� ������ >
//  - javac�� java ��, �ڹٰ��߿� ���Ǵ� ���ɵ��� 
//    ��� ��ġ������ �����ϰ��� �Ѵٸ� 
//    ȯ�� ���� �� 'path'�� jdk�� bin ����(���⿡ java, javac ���� ���ɾ �������)�� ����Ǿ��־�� �Ѵ�.
//    (������������ cd�� jdk�� bin�������� ã�ư��� �����ؾ� �ϴ� ���ŷο��� �ִ�.)
//  - �������� �ҽ����� ��ġ���� �����ؾ� �Ѵ�.
//    ����1. �̵� �ϱ� : cd ������
//		e.g. ���� ��ġ�� E����̺��, �������� D����̺��� myfolder���
//			 ==> D: -> enter -> cd myfolder -> enter
//    ����2. ���� ��ġ�� ����,���� ���� : dir

//  - �������� �Ϸ�Ǹ� �ƹ� �͵� ���� ������ ���;� �ϰ�, ��� �޼����� ��ٸ� ������ ������ �ǹ��Ѵ�.
//  - ������ ���Ŀ��� �ش� �ڸ��� ������ .class ������ �����Ǿ��ִ�. dir�� Ȯ���ϰų� ���� â�� ���� Ȯ���غ��� �ȴ�.
//  - class ������ ����Ŭ���ص� ����ǰų� ���� �� ����. �ֳ��ϸ� class ������ JVM�� ������ �� �ִ� ����Ʈ�ڵ�� ������ �ִµ� 
//    ����Ʈ�ڵ�� ���� JVM�� ���� �� �ְ� �ü���� �츮�� ���� �� ����. 
//    �츮�� ���ϴ� ����� ������ JVM���� class ������ �о���� �����ؾ� �Ѵ�.
//  - ���� �ڹٴ� class ���ϰ� JVM�� �ϳ��� ���α׷��̶�� ���� �ȴ�. (��, ���� JRE��.. �Ф�)
//    �ᱹ C�� C++ ���� exe ���α׷��� �������� �ʴ´�. 
//    ����! exe�� ����� ������ jsmooth��� ���α׷��� ����ϸ� �ȴ�.. ������ ���� ������ �����ϱ� ������ �ʳ� �ʿ��� �� ���۸��ϱ� �ٶ���..
// 3. �����ϱ� (JVM�� �⵿��!)
//  ���� : (cmd����) java Ŭ������ 
//  ���� : .class�� ���� �ʴ´� ( e.g. java Ŭ������.class (X) )

//    ���� : path��, ���� ��ġ�� ������� �����Ӱ� �����ϰ��� �ϴ� ����(���α׷�)�� �ִٸ� �׵��� �ִ� ��ġ�� �����صδ� Ư���� ���̴�.
//		     ����(���α׷�)�� �����ϵ��� ���� �� �� ����(���α׷�)�� ���� ��ġ�� ���ٸ�, 
//         ȯ�溯�� �� path�� �����ִ� ��ε��� ���ʷ� ���� �ش� ����(���α׷�)�� ã�Ƽ� �����ϴ� ���� �����̴�.
//         ping�̳� ipconfig�� ���� ���ɵ� ��� C:\Windows\system32 ������ ping.exe, ipconfig.exe�� �����ϴµ� 
//         C:\Windows\system32 ������ path�� �����ֱ� ������ 
//         �Ź� C:\Windows\system32\ping, C:\Windows\system32\ipconfig�� ������ �ʿ� ����
//             ping, ipconfig �� �� �ܾ�� ������ �� �ִ� ���̴�..
//    
//       => �츮�� jdk������ ��θ� JAVA_HOME�̶�� ������ ���� ����� �̿� bin�� �ٿ� path�� �߰��߾���.
//			(%JAVA_HOME%\bin)
//       => �׷� jdk�� bin ������ �ִ� ��� ���ɾ���� ��𼭳� �����Ӱ� ȣ���� �� �ִ�.
//          (������ ��Ŭ�������� ���� ���α׷��� ������ �Ź� �޸��� ���� �����ͷ� ������ �߱⶧���� cmd�� �������� �ؾ��ߴ�. 
//           �׷� ������ �Ź� ��θ� ���°� �����ұ� ������ �ϴ� �۾��̴�. ���ó����� �޸��忡 ������ ���� �ʱ� ������ 
//           �� ������ ���ذ� �ȵȴٸ� ���� ���� �� �ʳ� �����ϱ� ��õ�Ѵ� �Ф�) 
//  



// 1. �ּ��̶�,
// �ҽ������� ��� �ؽ�Ʈ�� �������� �ν��ϱ� ������, �޸� �ϰ� ���� ���� �ݵ�� �ؽ�Ʈ�� �� �տ� �޸����� ǥ���ؾ� �մϴ�. 
// �޸��� ���ĸ�Ī�� �ּ�(comments)��� �ϸ�, �ּ� ó�� ����� 2������ �ֽ��ϴ�.
// : �� �� �޸�(�ּ�) - ����Ű : (Ŀ�� �ø��ų� �巡��) ctrl + shift + c (�ٽ� ������ �ּ� ����)
/* : ���� �޸�(���� �ּ�) */ 

// 2. ��Ŭ�������� �ҽ�������.. 
// ���� : ctrl + s 
// ���� : ctrl + F11

// Test01.java�� Test01�̶�� �̸��� �ڹټҽ�����(.java)�� �ǹ��մϴ�.
//  �츮�� ctrl + F11�� ���� ������ ��Ű��
//  ���� ���� �ڹ� �����Ϸ��� Test01.java�� ������ Test01.class ������ �����մϴ�.
//  �� ���� JVM�� �⵿�Ͽ� Test01.class�� ����������(����)�մϴ�. 
//  ���� ���α׷� ����ڿ��� �ʿ��� ���� JVM�� Test01.class�����̸�,
//  Test01.java�� ��� Test01.class�� �ִٸ� ����˴ϴ�. (��� �ڵ峻���� �� �� �����ϴ�.)

public class Test01 { // Test01 Ŭ���� ������ ����
	// 3. Ŭ���� �ۼ� �� ���ǻ��� (�ܿ��� ���� �׳� �о����.)
	//  1) public class Ŭ������ => �ҽ����ϸ�, �� ���� �ݵ�� ���ƾ��մϴ�. 
	//  2) �̸� ������ ���� ��� ���� package explorer�� �ҽ������� ��Ŭ���ϰ� F2�� ���� �����մϴ�. (�̻��� â�� �߸� �׳� Ok��  Next ��������.) 
	//  3) �ڹٴ� Ŭ���� ��� ����Դϴ�. ���� ��κ��� �ڹ� �ڵ�� ������ Ŭ���� �ȿ����� �ۼ��Ǿ�� �մϴ�. 
	//    (��, ���� �� ������ package ����� ���߿� ��� import ������ �����մϴ�.)
	
	
	public static void main(String[] args) { // ���� �޼ҵ� ������ ����
	// 4. ���θ޼ҵ��,
	//  �ڹ� ���α׷��� �������� ������ �Ǵ� �߿��� �༮�Դϴ�.
	//  ���α׷��� ����Ǹ�, JVM�� �� ���θ޼ҵ带 ã�µ�, ���θ޼ҵ尡 ������ �������� �ʽ��ϴ�.
	//  ���θ޼ҵ��� '{'�� ���α׷��� ����, '}'�� ���α׷��� ���̶�� �����ϸ� �˴ϴ�.
	//  ���� : ���θ޼ҵ�� �ݵ�� public static void main(String[] args){...} �Դϴ�.
	//       ��ҹ���, ����, ��Ÿ�� �����ϼ���!
	//	���� : ��а��� ���� �޼ҵ� �ȿ����� �ڵ��մϴ�.
		
		System.out.println("Hello!");
		// 5. System.out.println( ����� ������ );
		// ǥ�� ��� ������ System.out.println()�Դϴ�. �ٿ��� sysout�̶���� ǥ���մϴ�.
		// �� ������ �Ұ�ȣ() ������ �����͸� �ܼ�(cmdâ, terminalâ, ��Ŭ���������� consoleâ)�� ����մϴ�.
		// ������! ���ڿ�(���� �� �� �̻�) �������� ���� �ֵ���ǥ(")�� �����־�� �մϴ�.
		
	} // ���� �޼ҵ� ������ ��
	// �˰����� ���θ޼ҵ� �ȿ��� sysout �� �� ���̾��׿�.
	// ��������δ� Hello�� ����Ϳ� ����ϴ� ª�� ���α׷��̾����ϴ�.
	// �� ���θ޼ҵ忡�� ���� ���� �ڵ带 ���� �� ���� �Ӹ� �ƴ϶�, ���� ��ü(��ǰ)�� ������ �����ؼ� ����� ���� �ֽ��ϴ�.
	
} // Test01 Ŭ���� ������ ��

// 5. �߰�ȣ�� �ǹ�?
// { : ������ ����
// } : ������ ��
// ���� : ���� ��� �ڵ��� ��ȣ����..( '()' '{}' '[]') �ݵ�� ¦���� �־�� �մϴ�!

// 6. �����ݷ�(;)�� �ǹ�?
// ������ ��ħǥ ������ �մϴ�. ���� 1���� ����Ǿ����� �ǹ��մϴ�. 
// �־�� �� �ڸ��� �����ݷ��� ���� ��� ������ �߻��ϴ� �����ϼ���.

// ��Ŭ�������� �ڵ带 �ۼ��� ���� 
// 	1. ������Ʈ �����
// 	2. ��Ű�� �����(���� �ȵ�. ��� �ҹ��ڷ�, 3�� ��ø�� ��õ e.g. com.ū�̸�.�����̸�)
// 	3. Ŭ���� �߰��ϱ�(���� �ȵ�. �� �ձ��� �빮�ڷ�, �ܾ� �ո��� �빮�ڷ�. e.g. MyFirstJava)
// ������ �����ϸ� �˴ϴ�. 















