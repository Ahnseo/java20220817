package ch15컬렉션프레임워크.lecture.p03map;

import java.util.HashMap;
import java.util.Map;


public class C01Map {
	public static void main(String[] args) {
		
	//Map <K,V>   key와 value로 한쌍(entry)으로 구성
	//key   : 중복 X  , 1개의 value에 Mapping 됨
	//value : 중복가능
	
	//특별한 이유 없으면 HashMap 쓰자 , 묻지도 따지지도 말고
	
	Map<String, String> map = new HashMap<>();
	
	//entry 추가
	map.put("jimin", "bts");
	map.put("jimin", "hot"); //이미 존재하는 키 -> 밸류 덮어씌움.
	map.put("batman", "dc");
	map.put("ironman", "marvel");
	
	int size = map.size();
	System.out.println(map.size());
	
	//제거
	map.remove("batman");
	System.out.println(map.size());
	
	//존재하는 키인지 확인방법
	boolean b1 = map.containsKey("ironman"); //boolean 타입
	System.out.println(b1); //t
	boolean b2 = map.containsKey("batman"); //boolean 타입
	System.out.println(b2); //f
	
	//value 얻기
	String val1 = map.get("jimin"); //hot 으로 맵핑
	System.out.println(val1);
	System.out.println(map.get("ironman"));
	System.out.println(map.get("batman")); //null
	
	}
}
