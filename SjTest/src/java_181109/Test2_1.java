package java_181109;

public class Test2_1 {

	// 신규 계좌를 생성한다.
	// 계좌의 예금주를 본인 이름으로 한다
	// 계좌번호를 부여한다
	// 초기 입금액 10000원을 넣는다
	// 3000원을 추가로 입금한다
	// 5000원을 출금한다
	// 계좌잔고를 출력한다
	public static void main(String[] args) {

		Test2 acc = new Test2("이상진", "111-11111-1111", 10000);
		System.out.println(acc.name + " , " + acc.accNum + " , " + acc.m1);

		acc.deposit(3000);
		System.out.println("현재 잔액 : " + acc.m1);

		acc.withdraw(5000);
		System.out.println("현재 잔액 : " + acc.m1);

	}
}
