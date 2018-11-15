package java_181114;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스의 다형성.
		//rc 변수에 Television 객체, Audio 객체를 각각 대입 할 때, 각각의 클래스로 동작
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		//static 메소드로 선언한것은 인터페이스에 곧바로 접근해서 호출해도 사용 가능하다.
		RemoteControl.changeBattery();
	}
}
