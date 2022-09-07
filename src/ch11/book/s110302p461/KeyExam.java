package ch11.book.s110302p461;

import java.util.HashMap;

public class KeyExam {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		//Map은 키와 밸류 로 구성되어있음.
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 new Key(1)로 홍길동을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 new Key(1)로 홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
	}
}
