package java_181108;

public class CarExample {
//객체지향 프로그래밍 (클래스)
	public static void main(String[] args) {
		Car C = new Car();	//car 클래스 타입의 C 라는 변수를 선언했다고 생각하라
		
		C.productionYear = 2018;
		C.currentSpeed = 100;
		
		System.out.println(C.company);
		System.out.println(C.maxSpeed);
		System.out.println(C.model);

	}

}
