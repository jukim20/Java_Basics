package com.javalec.basic;
/*
 * < return > 
 *  - �޼ҵ带 �����϶�.
 *  - ���� �츮�� �޼ҵ带 �������� �ʾ�����
 *    �޼ҵ��� ������ ���θ޼ҵ�� �˰� �ִ�. 
 *    ���� �޼ҵ忡 ����ִ� return�� ���θ޼ҵ带 �����ϴ� ������ �Ѵ�.
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println("return test");
		for(int i = 10; i >= 1; --i) {
			if(i % 4 ==0) { // i�� 4�� ������
				return; // ���θ޼ҵ带 �����϶� (�ᱹ ���α׷��� �����϶�� �ǹ�)
//				break;  
			}
			System.out.println(i);
		}
		System.out.println("return�� ���� �� ������ ��µ��� �ʴ´�!");
		
		/*
	 	< ���(1) return�� ��� >
	 	return test
		10
		9
		
		< ���(2) break�� ��� >
		return test
		10
		9
		return�� ���� �� ������ ��µ��� �ʴ´�! <= ų����Ʈ!!!!
		
	 	*/
	}
}








