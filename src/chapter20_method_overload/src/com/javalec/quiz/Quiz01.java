package com.javalec.quiz;

class Person {
	String name;
	int age = 10; // age의 기본값을 10살로 지정
	// 1. greet() : 이름을 인자값으로 넣으면
	// 			    (이름)님 안녕하세요~를 sysout
	// 				e.g. greet("홍길동"); => 홍길동님 안녕하세요~
	// 2. greet() : 이름과 나이를 인자값으로 넣고
	// 				들어온 나이가 이 객체의 나이보다 어리면 "~~(아)야 안녕?"을,
	// 				많으면 "~~님 안녕하세요~"를 출력
	// 				e.g. greet("홍길동", 7); => 홍길동아 안녕?
	// 				greet("고길동", 17); => 고길동님 안녕하세요~
	// < 추가 : setData() - 이름과 나이를 인자로 받으면 각각 name, age에 저장>
}

public class Quiz01 {
	// 메인메소드에서 테스트
}
