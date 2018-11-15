package java_181115;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// 5명의 이름을 입력받아서 입력된 이름을 출력하고 입력된 이름 중 가장 긴 이름을 출력
		Scanner S = new Scanner(System.in);
		List<String> people = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			System.out.println("이름입력");
			String sName = S.next();
			people.add(sName);
		}
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		String name = null;
		int size = 0;
		for (int i = 0; i < 5; i++) {
			if (size < people.get(i).length()) {
				size = people.get(i).length();
				name = people.get(i);
			}
		}
		System.out.println("가장 긴 이름 :" + name);

	}

}
