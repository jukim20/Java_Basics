package testpackage;

// AA와 같은 패키지에 살고있는 Test02 클래스
public class Test02 {
	public static void main(String[] args) {
		AA p = new AA();
		System.out.println(p.publicStr);
		System.out.println(p.protectedStr); // 접근 불가
		System.out.println(p.defaultStr);	// 접근 불가
//		System.out.println(p.privateStr);	// 접근 불가
	}
}
