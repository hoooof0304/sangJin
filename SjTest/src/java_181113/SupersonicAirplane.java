package java_181113;

public class SupersonicAirplane	extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	
	//
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다");
		}else {
			//부모 클래스의 메소드 호출	(재정의 되지 않은)
			super.fly();
		}
	}

}
