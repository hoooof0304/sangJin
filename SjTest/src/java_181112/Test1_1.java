package java_181112;

import java.util.Scanner;

public class Test1_1 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		Test1 T = new Test1();
		boolean run = true;

		while (run) {

			System.out.println("수행할 내용을 선택하세요");
			System.out.println("1. 두 점 사이의 거리 구하기");
			System.out.println("2. 절대값 구하기");
			System.out.println("선택 >>");
			int sNum = S.nextInt();

			if (sNum == 1) {
				System.out.println("두 점을 (x,y) 순으로 입력해주세요");
				System.out.print("첫번째 x 좌표 : ");
				double x = S.nextDouble();
				System.out.print("두번째 x 좌표 : ");
				double x1 = S.nextDouble();
				System.out.print("첫번째 y 좌표 : ");
				double y = S.nextDouble();
				System.out.print("두번째 y 좌표 : ");
				double y1 = S.nextDouble();
				double result = T.distance(x, x1, y, y1);
				System.out.println("두 점 사이의 거리는 " + result + "입니다");
			} else if (sNum == 2) {
				System.out.println("정수를 입력해주세요 ");
				int a = S.nextInt();
				int result1 = T.absolute(a);
				System.out.println("입력하신 정수의 절대값은 " + result1 + "입니다");
			}else {
				System.out.println("1이나 2만 입력");
			}

		}
	}
}
