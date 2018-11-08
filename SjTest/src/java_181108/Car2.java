package java_181108;

public class Car2 {
//1. 기본생성자, 2.model 매개변수 생성자,  3.model, color 매개변수 생성자, 4. model color maxSpeed 매개변수 생성자 
		String company = "현대자동차";
		String model;
		String color;
		int maxSpeed;
	//같은 이름으로 다양한 생성자를 활용 (생성자 오버로딩)
		Car2 (){
			
		}
		
		Car2 (String model){
			this.model = model;
		}
		
		Car2 (String model, String color){
			this.model = model;
			this.color = color;
		}
		
		Car2 (String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}

}
