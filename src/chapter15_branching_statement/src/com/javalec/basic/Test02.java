package com.javalec.basic;
/*
 * < continue > 
 *  - 반복문(while, do-while, for)에서, 
 *    continue 이하의 남은 종속문장을 건너뛰는 키워드 
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println("continue test");
		for(int i = 10; i >= 1; --i) {
			if(i % 4 ==0) { // i가 4의 배수라면
				continue; // 밑에 남은 문장(여기서는 sysout)을 건너뛰어라(+ 조건식으로 넘어가라)
			}
			System.out.println(i);
		}
		
		/*
		 	< 출력 >
		 	break test
			10
			9
			7
			6
			5
			3
			2
			1
			
				==> 4의 배수는 출력을 건너뜀
		 */
		 
		/*
		 *  break와 continue의 차이는 
		 *  반복이 유지되냐 아니냐
		 */
	}
}








