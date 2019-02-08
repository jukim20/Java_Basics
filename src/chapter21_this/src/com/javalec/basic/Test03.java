package com.javalec.basic;
/*
 * < 0번 인자 >
 * - 사실 메소드는 모든 객체가 개별적으로 가지고 있지 않다. (필드는 각자 가지고 있지만.)
 *   메소드는 호출될 때 생성되고 리턴되면 자동으로 사라진다.
 *   따라서 메소드는 호출 될 때마다 일시적으로 생겼다가 사라짐을 반복한다.
 * - 전화 올 때 발신자가 뜨는 것 처럼 
 *   메소드도 실행될 때 어떤 객체가 이 메소드를 호출했는지 알아야한다. 
 *   그래서 특정 메소드를 실행할 때 이 메소드를 호출하는 객체의 레퍼런스를 0번인자로 넣고 메소드를 실행한다. 
 * - p1.printData(); // printData()야, 너를 지금 p1이 실행시켰어!
 *   p2.printData(); // printData()야, 너를 지금 p2가 실행시켰어!
 *     => printData()를 실행할 때 각각 p1과 p2 값이 0번 인자가 된다.
 * - 이때 컴퓨터는 자동으로 이 0번 인자를 this에 저장하면서 메소드를 실행한다. 
 *   
 */
class Person3 {
	String name;
	int age;
	
	void setData(String n, int a) {
		this.name = n; 
		this.age = a;   
	}
	
	String getData() {
		return "이름 : " + this.name + "\n나이 : " + this.age + "세";
	}
	void printData() {
		System.out.println( this.getData() );
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Person3 p1 = new Person3(); // 0x10 으로 가정
		Person3 p2 = new Person3(); // 0x20 으로 가정 
		
		p1.setData("김피카츄", 10);
//    0x10.setData("김피카츄", 10);
//		 => this : 0x10
//		 => void setData(String n, int a) { // n:"김피카츄", a:10
//		       this.name = n; // 0x10.name = "김피카츄"; 
//		       this.age = a;  // 0x10.age = 10;
//	        }
		
		p2.setData("이푸린", 5);
//	  0x20.setData("이푸린", 5);
//		 => this : 0x20
//		 => void setData(String n, int a) { // n:"이푸린", a:5
//			   this.name = n; // 0x20.name = "이푸린"; 
//			   this.age = a;  // 0x20.age = 5;
//		    }
		
		p1.printData();
//	  0x10.printData();
//		 => this : 0x10
//		 => void printData() {
//				System.out.println( this.getData() );
//			}                       0x10.getData()
//									=> this : 0x10
//									=> String getData() {
//											return "이름 : " + this.name + "\n나이 : " + this.age + "세";
//									   }                     0x10.name                0x10.age
//										=>  return "이름 : 김피카츄 \n나이 : 10세";
//	     								=> printData() 실행 시점으로 돌아옴.
//		 => void printData() {
//				System.out.println( "이름 : 김피카츄 \n나이 : 10세" );
//		    }  		
		
		p2.printData();
//		  0x20.printData();
//			 => this : 0x20
//			 => void printData() {
//					System.out.println( this.getData() );
//				}                       0x20.getData()
//										=> this : 0x20
//										=> String getData() {
//												return "이름 : " + this.name + "\n나이 : " + this.age + "세";
//										   }                     0x20.name                0x20.age
//											=>  return "이름 : 이푸린 \n나이 : 5세";
//		     								=>  printData() 실행 시점으로 돌아옴.
//			 => void printData() {
//					System.out.println( "이름 : 이푸린 \n나이 : 5세" );
//			    } 
		
//		< 출력 결과 >
//		이름 : 김피카츄
//		나이 : 10세
//		이름 : 이푸린
//		나이 : 5세
		
	}
}

