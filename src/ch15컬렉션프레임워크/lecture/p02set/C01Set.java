package ch15컬렉션프레임워크.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
	public static void main(String[] args) {
		//Set interface : 순서유지 안됨, 개체중복저장 안됨.
		Set<String> set = new HashSet<>();
		
		//element(item) 추가
		set.add("ironman");
		set.add("captain");
		set.add("black");
		set.add("hurk");
		
		//element(item) 수
		set.size();
		System.out.println(set.size());
		
		//중복저장 안됨. 
		System.out.println(set.add("hurk")); //false  ,add() :boolean 타입 return
		System.out.println(set.size());// 사이즈 확인-> 중복 추가 안됨~
		
		//이미 있는지 확인
		System.out.println(set.contains("captain")); //true
		System.out.println(set.contains("batman")); //false, contains() :boolean 타입 return
		
		//지우기
		System.out.println(set.remove("captain")); //true, 지워짐
		System.out.println(set.remove("superman"));//false, 원래 없음. 
		
		System.out.println(set.size()); // 3
		
	}
}


