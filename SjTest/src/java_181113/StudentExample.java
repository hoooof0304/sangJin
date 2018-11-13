package java_181113;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성
		Student S = new Student("길동이", "000101-1111111", 1);
		//객체를 이용해 부모와 자식클래스의 필드값 print
		System.out.println(S.name + "," + S.ssn + "," + S.studentNo);
	}

}
