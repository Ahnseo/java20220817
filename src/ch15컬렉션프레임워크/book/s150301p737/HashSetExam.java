package ch15컬렉션프레임워크.book.s150301p737;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //중복
		set.add("iBATIS");
		
		System.out.println(set.size()); //4
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+ element);
			
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println(set.size()); //2
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+ element);
			
		}
		
//		set.clear();
//		if (set.isEmpty()) {
//			System.out.println("Empty");
//			
//		}
		System.out.println();
		
		//lecture.p02.C02Set에서 배운 전체탐색 사용해보기
		System.out.println("for문으로 탐색");
		for(String element : set) {
			System.out.println(element);
		}
		System.out.println();
		
		System.out.println("Iterator로 탐색");
		Iterator<String> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println();
		
		System.out.println("forEach 메소드로 탐색");
		set.forEach((e)-> System.out.println(e));
		
		
		
	}
}
