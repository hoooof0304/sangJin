package java_181109;

public class Test1 {
	
	
	String grade;
	int score = 0;
	int score1 = 0;
	String name;
	int sum;
	int avg;
	
	public Test1(String name,int score, int score1) {
		super();
		this.score = score;
		this.score1 = score1;
		this.name = name;
	}

	public void result() {
		
		sum = score+score1;
		avg = sum/2;
		
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else {
			grade = "F";
		}
		System.out.println(name + "학생의 학점은 :" + grade + "\n" + "각 점수는 :" + score + "," + score1);
	}
}
