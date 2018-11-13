package java_181113;

//CellPhone 클래스의 자식 클래스(상속)
//상속 방법 : 자식클래스명 뒤에 extends 부모클래스명
public class DmbCellPhone extends CellPhone {
	// 필드 선언
	int channel;

	// 생성자 선언 : model, color, channel을 매개변수로 하는
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	// 메소드 선언
	void turnOnDmb() {
		System.out.println("채널 :" + channel + "번 DMB 방송 수신을 시작합니다");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 수신 종료");
	}
}
