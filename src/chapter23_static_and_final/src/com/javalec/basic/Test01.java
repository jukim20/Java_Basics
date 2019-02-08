package com.javalec.basic;
/*
 * < static >
 * - ������, ������
 * - �ڹٿ����� static : ��ü ���� ���ص� ����� �� �ְ�, 1���� ���� 
 *  1. ���α׷� ���� ����(Ŭ���� �ε� ��) �̸� ���������(������ ���������). => ��ü ������ ���ص� ����� �� �ִ�. 
 *  2. 'Ŭ������'���� �����Ѵ�. => ��ü���� �ƴ϶�...
 *  3. �� ���� ���������. => ��� ��ü�� �������� ����Ѵ�. (�������� ���� ����)
 * - static Ű����� �ʵ�(�������), �޼ҵ� �տ� ���� �� �ִ�. Ŭ������ ������������ ���� �� ����.
 * - non-static : �ν��Ͻ� ��� <- �ν��Ͻ� ���� �ÿ� �����Ǵ� ���. �츮�� ���� �����Դ� �ʵ�� �޼ҵ� (���θ޼ҵ� ����!)
 *   static     : Ŭ����    ��� <- Ŭ���� �ε� �ÿ� �����Ǵ� ���
 *   
 *     ** Ŭ���� �ε�(class load)��?
 *      ��ǻ�� ���α׷��� ������ �� '�ε� ��'�̶�� �ܾ ���� ���� ���̴�.
 *      �ε�(loading; ����)�̶�, ���α׷� ���࿡ �ʿ��� �޸𸮸� ���ϰ�, �ʿ��� ���(������) ���� RAM �޸𸮿� �����ϴ� �۾��� ���ϴµ� 
 *      �� �߿��� Ŭ���� �ε�� Ŭ����(���赵)���� ��ü�� RAM�� �����ϴ� ���� ���Ѵ�!
 *       
 *       (��ü ���� �� �� ��ǻ�Ͱ� ���赵 ���鼭 ������ ����? 
 *        �� ���� ���赵 ��ü�� �޸� ��򰡿� �־�� ��ǻ�Ͱ� ���� �� �ִٴ� �ǹ���.
 *        ���� ������ �����Ǹ� �ȵǴϱ� RAM�� �״�� ���縦 �ϰ�(�̰��� Ŭ���� �ε�!), �װ� �о���̸鼭 ���α׷��� ������.)
 *       
 *  - ��ǻ�ʹ� Ŭ���� �ε带 �����ϴ� �߿� static���� ����� ������� ���� �� ���� 
 *    ��ٷ� �׵��� RAM�� �����Ѵ�.
 *    ��, ���α׷��� ���۵� ���� �̹� �׵��� �����Ѵ�!!
 *    �ݸ鿡 non-static ������� '���α׷� ���� ����' ��ü ���� ������ ������(new Ŭ������();) ���������! 
 *      
 */

import javax.swing.JOptionPane;


public class Test01 {
	public static void main(String[] args) {
//		������ �������� ã�ƺ���.
		Math.random();
		System.out.println();
		JOptionPane.showInputDialog("test");
		JOptionPane.showMessageDialog(null, "test");
		System.out.println( Math.PI );
//		 => random(), println(), showInputDialog(), showMessageDialog(), PI��
//		  1) ��ü ���� ���� ���� ���� �� �� �ִ�.
//		  2) �� �� �ܾ 'Ŭ�����̸�'�̴�.
//		         => Ŭ���� �̸����� ���۵Ǵ� �޼ҵ�/�ʵ�� static���� ����Ǿ��ִ� ����̴�.
		
//		< static�� Ư¡ 2. ������ ���� ��ü���� �ƴ� Ŭ���������� �����Ѵ�. >
		Math.random(); // Math Ŭ������ static ��� �޼ҵ� random()
		JOptionPane.showInputDialog("test"); // JOptionPane�� static ��� �޼ҵ� showInputDialog()
		JOptionPane.showMessageDialog(null, "test"); // JOptionPane�� static ��� �޼ҵ� showMessageDialog()
		double d = Math.PI; // Math Ŭ������ static ��� ���� PI
		
		
	}
}








