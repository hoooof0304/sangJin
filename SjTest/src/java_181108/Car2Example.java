package java_181108;

public class Car2Example {
	//1. 기본생성자, 2.model 매개변수 생성자,  3.model, color 매개변수 생성자, 4. model color maxSpeed 매개변수 생성자 
	
	public static void main(String[] args) {
		Car2 C = new Car2();
		Car2 C1 = new Car2("그랜저");
		Car2 C2 = new Car2("그랜저", "black");
		Car2 C3 = new Car2("그랜저", "black", 200);
		
		System.out.println(C3.company + C3.model + C3.color + C3.maxSpeed);

	}

}
