package java_181114;
//추상 클래스
public abstract class Phone {
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
	//추상 메소드 선언
	//추상메소드는 실행블록을 적지 않음
	public abstract void hangUp();
}
