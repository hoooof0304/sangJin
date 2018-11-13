package java_181113;

public class Student extends People{
	

	//필드 선언
	public int studentNo;
	
	
	//생성자 생성
	//자식 클래스에서 부모클래스의 생성자를 재정의 할 경우 super 사용
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
		// TODO Auto-generated constructor stub
	}
	
}
