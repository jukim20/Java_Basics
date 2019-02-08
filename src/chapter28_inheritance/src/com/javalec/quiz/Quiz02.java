package com.javalec.quiz;

/*
 * 부모 클래스 : Student 
 *  1) 필드 : 학생이름, 나이, 학교명
 *  2) 메소드 :
 *   	ㄱ. 생성자 
 *   		- 디폴트 생성자(기본생성자)
 *   		- 학생이름, 나이, 학교명 3개 넣고 생성되도록 
 *   	ㄴ. getters
 *   	ㄷ. setters
 * 자식 클래스1 : ElementaryStudent
 *  1) 추가할 필드 : 국어점수, 영어점수, 학부모 연락처
 *  2) 메소드 : 
 *   	ㄱ. 생성자 
 *   		- 학생이름, 나이, 학교명
 *   		- 학생이름, 나이, 학교명, 학부모 연락처
 *   		- 학생이름, 나이, 학교명, 국어점수, 영어점수
 *		ㄴ. getters
 *		ㄷ. setters
 * 자식 클래스2 : MiddleSchoolStudent
 *  1) 추가할 필드 : 국어점수, 영어점수, 수학점수, 평균점수		
 *  2) 메소드 : 
 *  	ㄱ. 생성자 
 *  		- 학생이름, 나이, 학교명, 국어점수, 영어점수, 수학점수
 *  		  (평균 자동 계산)
 *  	ㄴ. getters
 *  	ㄷ. setters
 * 자식 클래스3 : HighSchoolStudent
 *  1) 추가할 필드 : 국어점수, 영어점수, 수학점수, 평균점수, 내신등급	
 *  2) 메소드 : 
 *  	ㄱ. 생성자 
 *  		- 학생이름, 나이, 학교명, 국어점수, 영어점수, 수학점수
 *  		  (평균 자동 계산)
 *  	ㄴ. getters
 *  	ㄷ. setters
 * 
 * 메인 클래스 : Quiz02
 *  - 이름과 나이를 입력 받음
 *  - 나이에 따른 객체 생성 (예. 13 -> new ElementaryStudent())
 *  - 각 객체의 필드를 입력 받아서 저장 
 *    예. 중학생이면
 *    	  학교명, 국어점수, 영어점수, 수학점수 입력 받음
 *  - 결과 출력
 */

public class Quiz02 {

}
