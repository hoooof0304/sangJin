package java_181114;

public class PhoneExample {

	public static void main(String[] args) {
			//추상 클래스의 객체는 생성할수 없다
			//Phone phone = new Phone();
		
			SmartPhone sp = new SmartPhone("길동이");
			
			sp.turnOn();
			sp.internetSearch();
			sp.hangUp();
			sp.turnOff();
	}

}
