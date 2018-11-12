package java_181112;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];	//객체 배열 생성. 인덱스 100
	private static Scanner S = new Scanner(System.in);
	private static int count = 0;	//배열 인덱스 번호로 할당

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택 >>");

			int sNum = S.nextInt();

			if (sNum == 1) {
				createAccount();

			} else if (sNum == 2) {
				accountList();

			} else if (sNum == 3) {
				deposit();

			} else if (sNum == 4) {
				withdraw();

			} else if (sNum == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {

		System.out.println("-----------");
		System.out.println("계좌 생성");
		System.out.println("-----------");
		System.out.println("계좌번호 :");
		String ano = S.next();
		System.out.println("계좌주 :");
		String owner = S.next();
		System.out.println("초기입금액 :");
		int balance = S.nextInt();

		accountArray[count] = new Account(ano, owner, balance);		//배열에 각 객체 필드값 저장
		count++;	

		System.out.println("계좌가 생성되었습니다");
	}

	private static void accountList() {

		System.out.println("-----------");
		System.out.println("계좌 목록");
		System.out.println("-----------");
		for (int i = 0; i < count; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}	//accountArray[i]  - i인덱스에 해당하는 ano owner balance값을 get()을 이용해 가져와 출력

	}

	private static void deposit() {

		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.println("계좌번호 :");
		String accNum = S.next();
		System.out.println("예금액 :");
		int dep_Money = S.nextInt();
		for (int i = 0; i < count; i++) {
			if (accountArray[i].getAno().equals(accNum)) {
				accountArray[i].setBalance(accountArray[i].getBalance() + dep_Money);
				System.out.println("예금 성공");
			}		//accountArray[i] - i인덱스의 ano를 가져와 입력한 accNum과 비교, true면 
					//accountArray[i] - i인덱스의 balance에 i인덱스의 잔액 + 입력한 예금액을 set() 해줌
		}
	}

	private static void withdraw() {

		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.println("계좌번호 :");
		String accNum = S.next();
		System.out.println("출금액");
		int wit_Money = S.nextInt();
		for (int i = 0; i < count; i++) {
			if (accountArray[i].getAno().equals(accNum)) {
				accountArray[i].setBalance(accountArray[i].getBalance() - wit_Money);
				System.out.println("출금 성공");
			}	//accountArray[i] - i인덱스의 ano를 가져와 입력한 accNum과 비교, true면 
				//accountArray[i] - i인덱스의 balance에 i인덱스의 잔액 - 입력한 출금액을 set() 해줌
		}
	}
}
