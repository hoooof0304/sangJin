package java_181114;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);

	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}

	@Override
	public void hangUp() {
		System.out.println("통화 종료");
		
	}

}
