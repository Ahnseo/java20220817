package ch15컬렉션프레임워크.lecture.p03map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C02KeySetEntrySet {
	public static void main(String[] args) {
		//전체 entry 탐색
		// keyset이용 , for문으로 탐색 ,Iterator는 코드가 길어지니까 잘안쓰게되나봐..
		
		Map<String, String> map = new HashMap<>();
		map.put("korea", "seoul");
		map.put("us", "newYork");
		map.put("japan", "tokyo");
		
//		map.keySet(); // 키를 Set으로 리턴 한다.~
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			
			String value = map.get(key);
			System.out.println(key +" -> "+ value);
		}
		
		System.out.println("map.entrySet(); // Map클래스의 static 필드 이용.");
//		map.entrySet(); // Map클래스의 static 필드: Entry<K,V>  이용.
		Set<Map.Entry<String, String>> entries =  map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +","+ entry.getValue());
		}
		System.out.println("Map의 forEach 메소드 이용");		
		//Map의 forEach 메소드 이용
		map.forEach((k,v) -> System.out.println(k +","+v));
				
		
	}
}
