package java_181113;

public class Executive extends Employee {
	private boolean stock;

	public Executive(String name, int salary, boolean stock) {
		super(name, salary);
		this.stock = stock;
	}
	
	@Override
	public int increaseSalary() {
		salary = salary + (int)(salary * 0.3);
		return salary;
	}
	
	public boolean stock() {
		if(stock) {
			System.out.println("구매 가능");
		}else {
			System.out.println("자격 없음");
		}
		return stock;
	}
}
