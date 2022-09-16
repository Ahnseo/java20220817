package ch15컬렉션프레임워크.book.s150401;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장 put
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //덮어씌움
		System.out.println("총 엔트리(entry) 수 :" + map.size());//3
		
		//객체 찾기, key로 찾으면 됨
		System.out.println("\t 홍길동:"+ map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			int val = map.get(key); //하나씩 탐색
			System.out.println(key +","+ val);
		}
		System.out.println();
		
		map.remove("홍길동"); //제거
		
		System.out.println(map.size());//2
		System.out.println();
		
		System.out.println("향상for문");
		//keySet()
		Set<String> keys = map.keySet();
		for (String key : keys) {
			int val = map.get(key);
			System.out.println(key +","+ val); 
		}
		System.out.println();
		
		System.out.println("entrySet() 활용, Map.entry<K,V> 필드 활용");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		System.out.println();
		
		System.out.println("EachFor()");
		map.forEach((k,v) -> System.out.println(k+","+v));
		
		
		
		
		
		
	}
}
