package java_181113;

public class CarExample {

	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		Truck truck = new Truck();

		sedan.seat(5);
		truck.loadage(5);

		sedan.color = "빨간색";
		sedan.speedUp(200);

		truck.color = "검정색";
		truck.speedUp(100);

		System.out.println(sedan.color + "승용차의 속도는 " + sedan.speed + "이고, " + "좌석 수는" + sedan.seat + "입니다");
		System.out.println(truck.color + "트럭의 속도는 " + truck.speed + "이고, " + "적재량은 " + truck.loadage + "톤 입니다");

	}

}
