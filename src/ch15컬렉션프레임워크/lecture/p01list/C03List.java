package ch15컬렉션프레임워크.lecture.p01list;

import java.util.Iterator;
import java.util.List;

public class C03List {
	public static void main(String[] args) {
		//모든 아이템 탐색
		
		//for
		List<String> list = List.of("fire","ice","wind","water");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//향상된 for
		for(CharSequence item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//forEach메소드
		list.forEach((e) -> System.out.println(e));
		System.out.println();
		
		//Iterator
		Iterator<String> iterable = list.iterator();
		while (iterable.hasNext()) {
			String p = (String) iterable.next();
			System.out.println(p);
			
		}
		
	}
}
