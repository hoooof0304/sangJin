package java_181109;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator C = new Calculator();		//객체생성

		C.powerOn();
		System.out.println(C.plus(100, 150));
		System.out.println(C.minus(600, 100));
		C.powerOff();
	}

}
