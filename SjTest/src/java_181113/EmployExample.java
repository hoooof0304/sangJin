package java_181113;

public class EmployExample {

	public static void main(String[] args) {
		Employee E1 = new Employee("홍길이", 200);
		Employee E2 = new Employee("길동이", 210);
		E1.increaseSalary();
		E2.increaseSalary();

		Manager M1 = new Manager("이순신", 250, 25);
		Manager M2 = new Manager("장보고", 260, 26);
		M1.increaseSalary();
		M2.increaseSalary();

		Executive Exe1 = new Executive("둘리", 400, false);
		Executive Exe2 = new Executive("철이", 450, true);
		Exe1.increaseSalary();
		Exe2.increaseSalary();
		

		System.out.println(E1.name + "," + E1.salary);
		System.out.println(E2.name + "," + E2.salary);
		System.out.println(M1.name + "," + M1.salary + "," + M1.bonus());
		System.out.println(M2.name + "," + M2.salary + "," + M2.bonus());
		System.out.println(Exe1.name + "," + Exe1.salary + "," + Exe1.stock());
		System.out.println(Exe2.name + "," + Exe2.salary + "," + Exe2.stock());

	}

}
