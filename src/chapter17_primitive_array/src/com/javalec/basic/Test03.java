package com.javalec.basic;
/*
 * < �迭�� for�� >
 */
public class Test03 {
	public static void main(String[] args) {
		double[] numbers = {100.0, 200.0, 300.0, 400.0};
		
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		�� �ڵ�� �ݺ������� ������ �� �ִ�.
		
		for(int i = 0; i<4; ++i) { // i:0,1,2,3
			System.out.println(numbers[i]);
		}
		System.out.println();
		
//		�迭��.length : �� �迭�� ĭ ����(int)
		for(int i = 0; i<numbers.length; ++i) { // �� for������ �� for���� ȿ�����̴�.
			System.out.println(numbers[i]);
		}
		System.out.println();
		
//		Ȯ�� for��(foreach��) : �迭�� ���߿� ��� �÷��ǿ� ���Ǵ� Ư�� for��
//		���� : 
//			for(�ӽú��� ���� : ��� �迭��){
//				// �ݺ��� ����� (�ӽú����� ���)
//			}
		for(double num : numbers) {
			System.out.println(num);
		}
		System.out.println();
		/*
		 * ���� : 
		 *  �迭�� �ִ� ��� ���ҵ��� �� ���ʾ� �ӽú����� �����ϸ鼭 
		 *  �ݺ��� ������ �����Ѵ�. 
		 * ����! Ȯ�� for���� �迭�� ���Ҹ� ���������� ������ �� ����.
		 *      ���Ҹ� �ٲٷ��� �Ϲ� for���� ����ؾ� �Ѵ�.
		 */
	}
}












