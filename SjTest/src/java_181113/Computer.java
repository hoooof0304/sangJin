package java_181113;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 클래스의 메소드 재정의");
		return r*r*3.14159;
		
	}
	

}
