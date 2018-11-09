package java_181109;

public class CarExample {

	public static void main(String[] args) {
	/*	
		1.Car 클래스 객체 생성
		2. setGas 메소드 호출
		3. isLeftGas 메소드 호출  결과를 변수를 하나 선언해서 담기.
			선언된 변수를 가지고 run 메소드 호출
		*/
		
		Car C = new Car();
		
		C.setGas(10);
		boolean status = C.isLeftGas();
		C.run(status);

	}

}
