package com.javalec.basic;
/*
 * < 0�� ���� >
 * - ��� �޼ҵ�� ��� ��ü�� ���������� ������ ���� �ʴ�. (�ʵ�� ���� ������ ������.)
 *   �޼ҵ�� ȣ��� �� �����ǰ� ���ϵǸ� �ڵ����� �������.
 *   ���� �޼ҵ�� ȣ�� �� ������ �Ͻ������� ����ٰ� ������� �ݺ��Ѵ�.
 * - ��ȭ �� �� �߽��ڰ� �ߴ� �� ó�� 
 *   �޼ҵ嵵 ����� �� � ��ü�� �� �޼ҵ带 ȣ���ߴ��� �˾ƾ��Ѵ�. 
 *   �׷��� Ư�� �޼ҵ带 ������ �� �� �޼ҵ带 ȣ���ϴ� ��ü�� ���۷����� 0�����ڷ� �ְ� �޼ҵ带 �����Ѵ�. 
 * - p1.printData(); // printData()��, �ʸ� ���� p1�� ������׾�!
 *   p2.printData(); // printData()��, �ʸ� ���� p2�� ������׾�!
 *     => printData()�� ������ �� ���� p1�� p2 ���� 0�� ���ڰ� �ȴ�.
 * - �̶� ��ǻ�ʹ� �ڵ����� �� 0�� ���ڸ� this�� �����ϸ鼭 �޼ҵ带 �����Ѵ�. 
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
		return "�̸� : " + this.name + "\n���� : " + this.age + "��";
	}
	void printData() {
		System.out.println( this.getData() );
	}
}
public class Test03 {
	public static void main(String[] args) {
		
		Person3 p1 = new Person3(); // 0x10 ���� ����
		Person3 p2 = new Person3(); // 0x20 ���� ���� 
		
		p1.setData("����ī��", 10);
//    0x10.setData("����ī��", 10);
//		 => this : 0x10
//		 => void setData(String n, int a) { // n:"����ī��", a:10
//		       this.name = n; // 0x10.name = "����ī��"; 
//		       this.age = a;  // 0x10.age = 10;
//	        }
		
		p2.setData("��Ǫ��", 5);
//	  0x20.setData("��Ǫ��", 5);
//		 => this : 0x20
//		 => void setData(String n, int a) { // n:"��Ǫ��", a:5
//			   this.name = n; // 0x20.name = "��Ǫ��"; 
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
//											return "�̸� : " + this.name + "\n���� : " + this.age + "��";
//									   }                     0x10.name                0x10.age
//										=>  return "�̸� : ����ī�� \n���� : 10��";
//	     								=> printData() ���� �������� ���ƿ�.
//		 => void printData() {
//				System.out.println( "�̸� : ����ī�� \n���� : 10��" );
//		    }  		
		
		p2.printData();
//		  0x20.printData();
//			 => this : 0x20
//			 => void printData() {
//					System.out.println( this.getData() );
//				}                       0x20.getData()
//										=> this : 0x20
//										=> String getData() {
//												return "�̸� : " + this.name + "\n���� : " + this.age + "��";
//										   }                     0x20.name                0x20.age
//											=>  return "�̸� : ��Ǫ�� \n���� : 5��";
//		     								=>  printData() ���� �������� ���ƿ�.
//			 => void printData() {
//					System.out.println( "�̸� : ��Ǫ�� \n���� : 5��" );
//			    } 
		
//		< ��� ��� >
//		�̸� : ����ī��
//		���� : 10��
//		�̸� : ��Ǫ��
//		���� : 5��
		
	}
}

