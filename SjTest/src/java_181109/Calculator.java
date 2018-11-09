package java_181109;

public class Calculator {
	/*
	 * 정수형 필드 2개 선언 메소드 선언 1. 덧셈용 메소드 2. 뺄셈용 메소드 3. 전원관리를 위한 메소드
	 * 
	 * CalculatorExample 클래스 Calculator 클래스를 객체로 선언해서 선언된 메소드를 호출하면서 덧셈, 뺄셈 결과를
	 * 출력하세요
	 * 
	 */

	int number = 0;
	int number1 = 0;
	int result = 0;
	int result1 = 0;

	public int plus(int number, int number1) {
		result += (number + number1);
		return result;
	}

	public int minus(int number, int number1) {
		result1 += (number - number1);
		return result1;
	}

	public void powerOn() {
		System.out.println("On");
	}

	public void powerOff() {
		System.out.println("Off");
	}

}
