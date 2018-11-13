package java_181113;

public class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int increaseSalary() {
		salary = salary + (int) (salary*0.1);
		return salary;
		
	}
	
}
