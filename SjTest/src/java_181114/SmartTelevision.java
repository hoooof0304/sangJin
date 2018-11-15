package java_181114;
//다중 상속은 불가능하지만 다중 인터페이스 구현은 가능하다.

public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트티비 온");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트티비 오프");		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
