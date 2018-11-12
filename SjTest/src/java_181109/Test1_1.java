package java_181109;

public class Test1_1 {

	public static void main(String[] args) {
		Test1 stu1 = new Test1("이름1", 100, 90);
		
		stu1.result();
		//result()호출 결과는 해당 학생의 학점, 2과목의 점수를 각각 출력함
		//학점 기준은 90이상 A, 80이상 B, 70이상 C. 나머지는 F

	}

}