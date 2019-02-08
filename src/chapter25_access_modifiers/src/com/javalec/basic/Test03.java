package com.javalec.basic;
/*
 *  < public class와 그냥 class의 차이 >
 *  만약 Test03.java(하나의 소스파일)에
 *  Test03 클래스와 Person 클래스를 같이 만들면 
 *  컴파일 실행 후 각각 Test03.class, Person.class 두 개의 파일이 생성 된다. 
 *   ( 워크스페이스 -> 프로젝트 폴더 -> src ( 소스파일 )
 *   							bin ( 클래스파일 ) => src와 bin을 직접 확인해보자! )
 *  
 *  하나의 소스파일(.java)에는 한 개의 대표 클래스가 있어야 하고 그 것은 public으로 선언되어야 한다.
 *  나머지 클래스를 추가로 작성할 경우 그들은 public이 될 수 없다.
 *  
 *  public이 선언되지 않는다면, 디폴트 접근제어자가 적용되고
 *  결국 그 이야기는 나머지 클래스들은 패키지 안에서만 사용할 수 있다는 이야기이다.
 *  
 *  절대적이지는 않은 이야기지만 
 *  왠만한 클래스는 모두 public 클래스이어야한다.
 *  즉, 소스파일 1개에는 1개의 클래스만 있는 것이 좋다. 
 *  
 */
class BB {
	
} // 컴파일 후 com.javalec.basic 패키지의 BB.class로 컴파일 된다. 
public class Test03 {

} // 컴파일 후 com.javalec.basic 패키지의 Test03.class로 컴파일 된다.

// BB.class는 com.javalec.basic 안에서만 노출하는 클래스 (패키지 안에서만 사용하는 용도)
// Test03.class는 com.javalec.basic 안에서만 노출하는 클래스 (모두에게 노출하는 용도)

