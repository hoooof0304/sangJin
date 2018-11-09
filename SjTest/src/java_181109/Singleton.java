package java_181109;

public class Singleton {
	private static Singleton st = new Singleton();
				//클래스명 , 객체명, new, Singleton
	
	
	//생성자
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return st;
	}
	
}
