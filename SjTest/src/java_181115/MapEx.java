package java_181115;

import java.util.*;

public class MapEx {

	public static void main(String[] args) {
		// Map을 이용하여 단어장 프로그램 작성. 영단어를 입력하면 한글 뜻 출력, 없는 영단어를 입력하면 단어장에 없습니다 출력
		Scanner S = new Scanner(System.in);
		Map<String, String> word = new HashMap<String, String>();

		word.put("map", "지도");
		word.put("sort", "정렬");
		word.put("phone", "전화기");
		word.put("sleep", "잠");
		word.put("water", "물");

		System.out.println("단어를 입력하세요");
		String answer = S.nextLine();
		String korWord = word.get(answer);
		if (korWord == null) {
			System.out.println("없음");
		} else {
			System.out.println("입력한 단어의 뜻 : " + korWord);
		}

	}
}
