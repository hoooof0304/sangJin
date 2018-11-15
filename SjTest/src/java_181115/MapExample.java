package java_181115;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// Map 객체 선언
		// 제네릭 타입으로 키값, 밸류를 지정
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Map 컬렉션에 데이터 추가
		// 중복 데이터가 있을경우 덮어쓰기 처리
		map.put("띠용", 1);
		map.put("띠용2", 2);
		map.put("띠용3", 3);
		map.put("띠용4", 4);
		map.put("띠용5", 5);

		// Map 컬렉션 크기 가져오기
		System.out.println(map.size());

		// 특정 데이터 찾기
		System.out.println(map.get("띠용3"));

		// 모든 데이터 출력
		Set<String> keySet = map.keySet(); // key 값으로만 이루어진 Set 컬렉션을 만들고,
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + "," + value);
		}
	}

}
