package java_181108;

public class KoreanExample {
//생성자를 이용한 필드값 세팅하기
	public static void main(String[] args) {
		// 매개변수값을 다르게 하여 2개의 객체를 생성해보세요
		Korean K = new Korean("이상진", "???");
		Korean K1 = new Korean("???~", "!!!!");
		//해당 필드값을 출력해보세요
		System.out.println(K.name + K.ssn);
		System.out.println(K1.name + K1.ssn);

	}

}
