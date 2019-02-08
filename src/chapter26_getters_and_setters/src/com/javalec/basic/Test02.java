package com.javalec.basic;
/*
 * < 은닉화와 캡슐화 > 
 *  - 객체지향 프로그래밍의 핵심 목표
 *   1) 은닉화
 *   2) 캡슐화
 *   3) 상속  => 나중에 배움
 *   4) 다형성 => 나중에 배움
 *   5) 추상화 => 나중에 배움
 * 
 * 
 * 1. 은닉화(data hiding)
 *  1) 객체 무결성을 지키기 위하여 데이터를 숨김 (잘못된 데이터가 들어오지 못하도록 접근을 못하게 막음.)
 *  2) 보여줄 것은 보여주되, 불필요한 노출을 하지 않는 것. (다 보여주면 오히려 사용자가 혼란스러움.) 
 *  3) 보안적인 이유로 데이터를 숨기는 것.
 *  
 *  
 * 2. 캡슐화(data encapsulation) 
 *  1) 보호막 치기, 묶어버리기
 *  2) 은닉화를 구현하는 방법 중 하나.
 *  3) 데이터와 행위를 하나로 묶는 것. 
 *     => 클래스(객체는 정보(필드)와 행위(메소드)를 모두 가지고 있음), 메소드(명령 여러 개 하나로 묶기) 등의 등장 배경 
 *   
 *  ** 은닉화와 캡슐화가 필요한 이유 **  
 *  	- 알약
 *   	 ㄱ. 알약 안에 뭐가 있던 상관 없이 '감기약','진통제','소화제'라는 포장지만 봐도 용도를 알 수 있다. 
 *   	 ㄴ. 알약 안에는 여러 가지 성분의 가루약이 들어있다.  
 *   	        이들을 따로따로 먹는 것보다 1알로 '합쳐서' 먹는 것이 편하다.
 *    
 *  	- 핸드폰
 *  	  ㄱ. 핸드폰이 어떻게 동작하는지 자세히 몰라도 간단한 사용법만 숙지하면 편리하게 사용할 수 있다.
 *  	  ㄴ. 핸드폰 부품은 수 만 가지가 있다.
 *     		 이들을 일일히 사서 사용자가 조립해서 사용하는 것보다, 아예 한 몸체에 '합쳐서' 사용하는 것이 편하다.
 *   		 
 *  	- 객체 
 *   	 ㄱ. 객체가 어떤 구성으로 되어있는지, 어떤 행위를 하는지 자세히 몰라도 충분히 사용하기 쉬워야 한다. (e.g. 국영수 넣으면 자동으로 평균, 학점 계산..)
 *   	 ㄴ. 어떠한 객체에 대해 해야하는 일이 여러가지가 있다면, 
 *   	        객체 외부에서(e.g. 메인메소드) 처리하는 것보다, 애초에 그 기능들을 클래스 하나에 '합쳐서' 미리 구현해두면 사용할 때 편하다.
 *     	    e.g. p.avg = (p.kr + p.en + p.ma) / 3.0; 보다 
 *               p.setAvg(); 가 편하다. 
 * 
 * 3. 캡슐화와 은닉화를 위한 클래스 정의 규칙 
 *  1) 필드는 private으로 (정보 은닉을 위해 ) 
 *  2) getter와 setter 메소드는 public으로 (보호막 역할)
 * 
 * 4. getters and setters
 *  - 객체 캡슐화를 구현하기위한 필수 메소드 
 *  - getter : 필드 값을 외부에 노출할 때 사용하는 메소드
 *  - setter : 외부에서 필드 값을 지정(저장)할 때 사용하는 메소드
 */
class Person2 {  
	private String name;
	private int age; // 필드를 private으로 선언하여 외부로부터의 접근을 막음
	
	// 대신 간접적으로 필드에 접근할 수 있는 연결다리를 만듦	
	public void setName(String name) { // 이름을 대신 저장해주는 
		this.name = name;
	}
	public void setAge(int age) { // 나이를 대신 저장해주는
		this.age = (age > 0) ? age : 0;
		// 음수가 들어오면 차라리 0살로 설정하라!
	}

	public String getName() { // name 값을 보여주는 
		return name;
	}
	public int getAge() { // age 값을 보여주는
		return age;
	}
	
	/*
	 * 1. getter의 기본 형식 
	 *  public 필드자료형 get필드명(){
	 *  	return 필드값;
	 *  }
	 *  예)
	 *  	private int age;
	 *  	public int getAge(){
	 *  		return age;
	 *  	}
	 *  
	 *  ** 단, 필드자료형이 boolean일 경우 get필드명()이 아닌 is필드명()으로 한다.
	 *     예) 
	 *      	private boolean pass;
	 *      	public boolean isPass(){
	 *      		return pass;
	 *      	}
	 *  
	 * 2. setter의 기본 형식
	 *  public void set필드명(필드자료형 변수명){
	 *  	this.필드명 = 변수명;
	 *  }
	 *  예) 
	 *  	private void setName(String name){
	 *  		this.name = name;
	 *  	}
	 *  
	 *  getter, setter 자동완성 : 클래스 안에 커서 두고, 우클릭 -> source -> Generate getters ...
     *            생성자 자동완성 : 클래스 안에 커서 두고, 우클릭 -> source -> Constructor using fields 
	 */
}
public class Test02 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		
//		p.age = -10; // (X)
		p.setAge(-10); // 실수로 음수를 저장했어도
		System.out.println(p.getAge()); // 다행히 0살로 나옴
		
//		getter와 setter는 객체 캡슐화의 필수요소 중 하나이다. 
//		특히 안드로이드와 웹개발을 할 때 getter, setter가 없으면 오류를 내는 경우도 있으니 
//		웹, 앱 개발을 희망하는 학생들은 꼭 기억해두자! 
		
//		Quiz02.java 문제풀기!
	}
}









