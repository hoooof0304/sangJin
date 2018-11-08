package java_181108;

import java.util.Scanner;

public class Test12 {
//	 학생수 점수입력 점수리스트 분석 종료
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		int score = 0;
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		boolean run = true;
		int[] student = null;

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생 수  ||  2. 점수 입력  || 3. 점수 리스트  ||  4. 분석  ||  5. 종료  ||   ");
			System.out.println("-------------------------------------------------");
			int s_Num = S.nextInt();
			if (s_Num == 1) {
				System.out.print("학생 수 >>");
				student = new int[S.nextInt()];

			} else if (s_Num == 2) {
				for (int i = 0; i < student.length; i++) {
					System.out.println((cnt + 1) + "번째 학생 점수 :");
					student[i] = S.nextInt();
					cnt++;
				}

			} else if (s_Num == 3) {
				for (int i = 0; i < student.length; i++) {
					System.out.println((cnt1 + 1) + "번째 학생 점수 :" + student[i] + "점");
					cnt1++;
				}

			} else if (s_Num == 4) {
				for (int i = 0; i < student.length; i++) {
					sum += student[i];
				}
				System.out.println("총합 :" + sum);

				avg = (sum / cnt);
				System.out.println("평균 :" + avg);

			} else if (s_Num == 5) {
				run = false;
			}

		}

	}

}
