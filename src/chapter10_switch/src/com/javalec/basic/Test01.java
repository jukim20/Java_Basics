package com.javalec.basic;

import java.util.Scanner;

/*
 * < switch-case�� >
 *  - ���� : 
 *  	switch(���ذ�){
 *    	case �񱳰�1: 
 *   		���ذ�==�񱳰�1�� �� ������ ��ɹ���
 *   		break;
 *   	case �񱳰�2: 
 *   		���ذ�==�񱳰�2�� �� ������ ��ɹ���
 *   		break;
 *    	case �񱳰�3: 
 *   		���ذ�==�񱳰�3�� �� ������ ��ɹ���
 *   		break;
 *    	case �񱳰�4: 
 *   		���ذ�==�񱳰�4�� �� ������ ��ɹ���
 *   		break;
 *   	default: // �־ �ǰ� ��� ��.
 *    		���ذ��� ���� ��� �񱳰��� �ٸ��� ������ ��ɹ���
 *  	}
 * - ���� case�� default�� ���̺�(label)�̶�� �Ѵ�. 
 *   ** label�̶�? : �ڵ忡�� å������ ������ �Ѵ�.
 *   				���⼭���� �����϶�� �ǹ��̸�, 
 *   				�����ݷ�(;)�� �ƴ϶� �ݷ�(:)���� ǥ���Ѵ�.  
 * - ����! case�� �Ǽ��� ������ �� ����.
 *   e.g. 
 *     case 3: (O)
 *     case 'A': (O)
 *     case "ABC": (O)
 *     case 3.14: (X) ==> ��������! 
 *     (�����ڷ��� ��Ʈ����, �Ǽ��� �������� �ִٰ��ߴ�. ���� ��� 3.14�� ���� ���� 3.140000000004 ��� ���� ������ �߻��� ���ɼ��� �ִ�.)
 * - ����! ���ذ�(�Ұ�ȣ �ȿ� �� ��)�� �񱳰�(case ��)�� �ڷ����� ���ƾ� �Ѵ�.
 *   e.g. 
 *     char ch='A';
 *     swtich(ch){
 *     case 'A': (O)
 *     case "A": (X)
 *     }
 *  
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("������ �Է��ϼ��� : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("1�̴�!");
			break;
		case 2: 
			System.out.println("2�׿�~~");
			break;
		case 3: case 4: // num�� 3 Ȥ�� 4�� ��� 
			System.out.println("3 or 4�Դϴ�");
			break;
		default:
			System.out.println("1~4�� �ƴϳ׿�!");
		}
		/*
		  < ��� ��(1) >
		  ������ �Է��ϼ��� : 2
		 2�׿�~~
		
		  < ��� ��(2) >
		  ������ �Է��ϼ��� : 7
		 1~4�� �ƴϳ׿�!

		 */
	}
}













