package java_181115;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		// Set 컬렉션에 데이터 추가
		// Set 컬렉션은 중복 데이터가 있을경우 하나의 데이터만 입력받는다. (Null값도 하나만 입력된다)
		// 데이터 입력시 공백 또한 문자로 인식된다.
		set.add("졸리다");
		set.add("자고싶다");
		set.add("눈이감긴다");
		set.add("가나다라마");
		set.add("바사아자차");
		set.add("졸리다");
		// Set 컬렉션 크기 확인
		int size = set.size();
		System.out.println(size);

		// Set 컬렉션 데이터 가져오기
		// 반복자 (Iterator) 사용
		Iterator<String> iterator = set.iterator();	// Iterator 타입의 iterator객체 선언
		while(iterator.hasNext()) {					// hasNext()메소드의 역할 : 가져올 값이 있는지 없는지 체크. 있다면 true
			String element = iterator.next();		// iterator.next()  :  꺼낸 값을 리턴
			System.out.println(element);
		}
	
		// Set 컬렉션 데이터 삭제하기
		set.remove("바사아자차");
		set.clear(); 		//전체 삭제
		set.isEmpty(); 		//비어있는지 아닌지 체크. 비어있다면 true
	
	
	}

}
