package java_181109;

public class Test2 {

	String name;
	String accNum;
	int m1;
	
	public Test2(String name, String accNum, int m1) {
		this.name = name;
		this.accNum = accNum;
		this.m1 = m1;
	}
	
	
	
	public int deposit(int m2) {
		m1 += m2;
		return m1;
	}
	
	public int withdraw(int m3) {
		m1 -= m3;
		return m1;
	}
	
	
	
	
	
}
