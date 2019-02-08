package com.javalec.basic;
/*
 * < 상속 시 유의사항 >
 * 1. 자바에서는 다중 상속(부모를 여러 개 두는 것)이 안됨.
 *  	class A{} 
 *  	class B{}
 *  	class C extends A,B {} // (X)
 *  	-----------------------------
 *  	class A{}
 *  	class B extends A{}
 *  	class C extends B{} // (O) 중첩 상속은 가능
 *  
 * 2. 올바른 상속 관계  
 * - 무조건 겹치는 부분이 있다고 해서 상속을 남용해서는 안됨
 * - 상속의 규칙: is-a has-a
 *  A is a B : 'A는 B이다.'라는 말이 성립한다면, A는 B를 상속 받아도 된다..
 *   e.g.
 *    A: SoccerBall 클래스				  B: Ball 클래스
 *    A: Circle 클래스 		   			  B: Shape 클래스
 *    A: Superman, Batman, Spiderman 클래스 B: Hero 클래스  
 *    
 *  A has a B : 'A는 B를 가진다' 말이 성립한다면 , A는 B를 상속 받으면 안된다.
 *    A: SoccerBall 클래스            B: Soccer 클래스 (차라리 Ball 클래스를 상속 받는 것이 낫다.)
 *    A: Spiderman 클래스 		  B: Spider 클래스 (차라리 Man 클래스를 상속 받는 것이 낫다.)
 *    
 */
public class Test06 {

}
