package java_181115;

import java.util.*;

//ArrayList 예제
public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList 객체 선언

		List<String> list = new ArrayList<String>();
		// <> : 제네릭 (Generic) 불필요한 타입변환을 제거해 주는 역할을 함.
		// 제네릭을 쓰지 않을 경우
		// List list = new ArrayList();
		// list.add("이름");
		// Object obj = list.get(0);
		// String name = (String)obj;

		// 제네릭을 사용 할 경우
		// List<String> list = new ArrayList<String>();
		// list.add("이름");
		// String name = list.get(0);

		list.add("오늘");
		list.add("너무");
		list.add("졸리다");
		list.add("존다");
		list.add("졸리다..");

		// 리스트 객체 크기 확인
		int size = list.size();
		System.out.println(size);

		// 리스트 객체의 데이터 가져오기
		String data = list.get(2);
		System.out.println("2번 인덱스에 들어있는 값 :" + data);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		//리스트 데이터 삭제하기
		list.remove(2);
		list.remove(2);
		//처음 2번 인덱스의 값이 지워진 후, 기존 3번인덱스의 값이 2번으로 당겨짐.
		list.remove("오늘");
		//인덱스값을 이용해 지울 수 있고, 데이터를 이용해 지울 수 도 있다.
	}
}
