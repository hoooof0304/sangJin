package java_181109;

import java.util.Scanner;

public class Test3_1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Test3 log = new Test3();
		boolean run = true;
		while (run) {
			System.out.println("-------------------------");
			System.out.println("수행할 서비스를 선택해주세요");
			System.out.println("1. 로그인 || 2. 로그아웃");
			int sNum = S.nextInt();

			if (sNum == 1) {
				System.out.println(">>" + sNum);

				System.out.print("아이디를 입력하세요 : ");
				String idpw1 = S.next();

				System.out.print("비밀번호를 입력하세요 : ");
				String idpw2 = S.next();
				
				log.login(idpw1, idpw2);

			} else if (sNum == 2) {
				log.logout();
				run = false;
			} else {
				System.out.println("1번과 2번 중 하나를 고르세요.");
			}

		}

	}

}
