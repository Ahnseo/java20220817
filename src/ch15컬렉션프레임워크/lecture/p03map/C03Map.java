package ch15컬렉션프레임워크.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("korea", "seoul");
		map1.put("us", "newYork");
		map1.put("japan", "tokyo");
		System.out.println("map1 :" + map1);
		System.out.println();
		
		// .of(k1,v1,  k2,v2,  k3,v3 ...) 수정 불가능한 map 을 만들때 사용, 자바9 버전부터사용가능.8버전안됨
		Map<String, String> map2
		= Map.of("korea", "seoul",
				 "us", "newYork",
				 "japan", "tokyo");
		
		System.out.println("map2 :" + map2);
		System.out.println(map2.size());
		System.out.println(map2.containsKey("korea"));
		
		
		
	}
}
