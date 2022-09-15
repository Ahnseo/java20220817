package ch15컬렉션프레임워크.book.s150301p739;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		//다른 객체 이지만, 동일한 데이터 를 넣었으니, 중복x ,1개만 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수: "+ set.size());
	}
}
