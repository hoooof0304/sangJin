package java_181113;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 에 대한 객체 생성
		DmbCellPhone DCP = new DmbCellPhone("A", "black", 17);
		//필드값 출력
		System.out.println(DCP.model + "," + DCP.color + "," + DCP.channel);
		//부모 클래스의 메소드 호출
		DCP.powerOn();
		DCP.bell();
		DCP.sendVoice("Hi");
		DCP.receiveVoice("Hello");
		DCP.hangUp();
		//자식 클래스의 메소드 호출
		DCP.turnOnDmb();
		DCP.changeChannelDmb(27);
		DCP.turnOffDmb();

	}

}
