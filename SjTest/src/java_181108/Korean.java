package java_181108;

public class Korean {
	// 생성자를 이용한 필드값 세팅하기
	// 필드선언

	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자 선언
//	Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}

	// this 사용법
	Korean(String name, String ssn) {
		this.name = name;		//this.name 에서 name은 필드의 name값.
		this.ssn = ssn;
	}
}
