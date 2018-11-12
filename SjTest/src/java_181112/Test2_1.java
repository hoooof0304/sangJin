package java_181112;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
		Test2 T = new Test2();
		Scanner S = new Scanner(System.in);
		Test2[] stuArr = new Test2[10];
		int count = 0;
		while (true) {

			System.out.println("하고싶은 업무 선택");
			System.out.println("1. 이름 및 점수 등록 || 2. 학생 목록 보기");
			int sNum = S.nextInt();
			System.out.println("선택 >>");
			if (sNum == 1) {
				System.out.println("학생이름 :");
				String name = S.next();
				System.out.println("국어점수 :");
				int kScore = S.nextInt();
				System.out.println("영어점수 :");
				int eScore = S.nextInt();
				System.out.println("수학점수 :");
				int mScore = S.nextInt();

				stuArr[count] = new Test2(name, kScore, eScore, mScore);
				count++;

			} else {
				for (int i = 0; i < count; i++) {
					System.out.println("학생 이름 :" + stuArr[i].name);
					System.out.println("국어 점수 :" + stuArr[i].kScore);
					System.out.println("영어 점수 :" + stuArr[i].eScore);
					System.out.println("수학 점수 :" + stuArr[i].mScore);
				}
			}
		}
	}

}
