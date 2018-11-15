package java_181114;
//강제 형변환 예시
public class InstanceofExample {

	public static void method1(Parent parent) {		//Parent 클래스 타입의 parent 매개 변수
		// instanceof - parent 변수가 Child 타입인가?
		// instanceof : 변수가 특정 클래스 타입인지를 물어보는 역할. 리턴은 boolean
		if (parent instanceof Child) {
			//parnet 변수를 Child 클래스 타입으로 강제 형변환해서 
			//Child 클래스 타입의 변수 child에 대입
			Child child = (Child) parent;
			
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환하지 못했음");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		//parentA - Parent 클래스 타입의 변수, Child 객체가 대입됨
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		//parentB - Parent 클래스 타입의 변수, Parent 객체가 대입됨
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
