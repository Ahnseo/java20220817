package ch15컬렉션프레임워크.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C03SetOf {
	public static void main(String[] args) {
		//Set.of() : 수정 불가능한, Set만들기
		
		Set<String> set = Set.of("a","b","c","d");
		System.out.println(set);
		
//		set.add("e"); //x 오류남
//		set.remove("a");//x 오류남
		
		System.out.println(set.size()); // 다른 메소드는 사용가능. 하지만, 버전 자바9 부터 사용할수있는기능
		System.out.println(set.contains("b")); // 다른 메소드는 사용가능. 하지만, 버전 자바9 부터
		
	}
}
