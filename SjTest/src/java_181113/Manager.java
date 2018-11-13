package java_181113;

public class Manager extends Employee {

	private int bonus;

	public Manager(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int increaseSalary() {
		salary = salary + (int)(salary * 0.2);
		return salary;

	}
	
	public int bonus() {
		bonus = (int) (salary*0.1);
		return bonus;
		
	}
}
