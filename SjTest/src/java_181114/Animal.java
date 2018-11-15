package java_181114;

public abstract class Animal {
	//추상 클래스
	//동물의 종을 담는 필드, 숨을 쉰다는 메소드, 소리를 낸다는 추상 메소드, Cat Dog 클래스를 실체 클래스로 구현
	//AnimalExample 클래스
	
	public String type;
	
	public Animal(String type) {
		this.type = type;
	}

	public void breath() {
		System.out.println("숨을 쉼");
	}
	
	public abstract void sound();
}
