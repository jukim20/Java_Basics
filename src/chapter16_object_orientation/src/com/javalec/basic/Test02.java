package com.javalec.basic;

public class Test02 { 
	public static void main(String[] args) {
//		< 인스턴스 사용 시 주의점 1 >
		Person per1;
//		System.out.println(p1); // 에러! (p1는 메인메소드 안에 선언되었으므로 지역변수다. 쓰레기값이 들어있다.)
		
		per1= new Person();
		System.out.println(per1); // com.javalec.basic.Person@7852e922
		
//		< 인스턴스 사용 시 주의점 2 >
//		 - 참조변수에는 0대신 null(0번지, 혹은 '없다'라는 뜻)을 사용해야 한다.
//		Person per2 = 0; 	// X
//		Person per2 = null; // O
		
		
//		< 인스턴스 사용 시 주의점 3 >		
		Person per2 = null;
//		per2.age = 20; 
		 // 에러! 현재 per2에는 null이 저장되어있다. 즉, 아직 주소가 적히지 않은 상태이기 때문에
		 // 인스턴스와 연결되지 않은 상태이다. 따라서 age라는 방(멤버변수) 또한 찾아갈 수 없다.
		per2 = new Person(); 
		per2.age = 20;
		
		System.out.println("per1의 나이 : " + per1.age); // per1의 나이 : 0
		System.out.println("per2의 나이 : " + per2.age); // per2의 나이 : 20
		
//		< 인스턴스 사용 시 주의점 4 >
		per1 = per2; // per2에 담겨있는 주소값을 per1에도 저장하라.
		System.out.println("per1의 나이 : " + per1.age); // per1의 나이 : 20
		System.out.println("per2의 나이 : " + per2.age); // per2의 나이 : 20
		// 이때 per1, per2는 1개의 인스턴스의 주소를 동시에 갖고 있기 때문에 
		// 두 레퍼런스변수는 모두 동일한 객체를 참조하고 있다. 
	}
}











