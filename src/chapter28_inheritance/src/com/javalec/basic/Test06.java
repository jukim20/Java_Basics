package com.javalec.basic;
/*
 * < ��� �� ���ǻ��� >
 * 1. �ڹٿ����� ���� ���(�θ� ���� �� �δ� ��)�� �ȵ�.
 *  	class A{} 
 *  	class B{}
 *  	class C extends A,B {} // (X)
 *  	-----------------------------
 *  	class A{}
 *  	class B extends A{}
 *  	class C extends B{} // (O) ��ø ����� ����
 *  
 * 2. �ùٸ� ��� ����  
 * - ������ ��ġ�� �κ��� �ִٰ� �ؼ� ����� �����ؼ��� �ȵ�
 * - ����� ��Ģ: is-a has-a
 *  A is a B : 'A�� B�̴�.'��� ���� �����Ѵٸ�, A�� B�� ��� �޾Ƶ� �ȴ�..
 *   e.g.
 *    A: SoccerBall Ŭ����				  B: Ball Ŭ����
 *    A: Circle Ŭ���� 		   			  B: Shape Ŭ����
 *    A: Superman, Batman, Spiderman Ŭ���� B: Hero Ŭ����  
 *    
 *  A has a B : 'A�� B�� ������' ���� �����Ѵٸ� , A�� B�� ��� ������ �ȵȴ�.
 *    A: SoccerBall Ŭ����            B: Soccer Ŭ���� (���� Ball Ŭ������ ��� �޴� ���� ����.)
 *    A: Spiderman Ŭ���� 		  B: Spider Ŭ���� (���� Man Ŭ������ ��� �޴� ���� ����.)
 *    
 */
public class Test06 {

}
