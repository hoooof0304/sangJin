package java_181114;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	//구현 메소드에서 별도의 재정의를 하지 않아도 사용할 수 있음
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다");
		}else {
			System.out.println("무음 해제 합니다");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환합니다");
	}

}
