package java_181113;
//형변환 예제 ( 자식 클래스 타입 - > 부모 클래스 타입)


//A클래스 선언
class A {
	
}

//A클래스의 자식 클래스 B 선언
class B extends A{
	
}
//A의 자식 클래스 C 선언
class C extends A{
	
}
//B의 자식 클래스  D 선언
class D extends B{
	
}
//C의 자식 클래스 E 선언
class E extends C{
	
}
public class PromotionExample {

	public static void main(String [] args) {
		//B 클래스 타입 변수(객체) b 선언
		B b = new B();
		//C 클래스 타입 변수(객체) c 선언
		C c = new C();
		//D 클래스 타입 변수(객체) d 선언
		D d = new D();
		//E 클래스 타입 변수(객체) e 선언
		E e = new E();
		
		//b~d의 변수를 A 클래스 타입의 변수에 대입해보기
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		
		B b1 = d;
		C c1 = e;
		
		//b 와 e 는 서로 상관관계가 아님
//		B b2 = e;
//		C c2 = d;
		
		//강제 형변환 필요
		B b3 = (B) a1;
		
	}
}
