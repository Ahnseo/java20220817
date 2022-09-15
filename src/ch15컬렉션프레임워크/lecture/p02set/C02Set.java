package ch15컬렉션프레임워크.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		//전체 탐색하는방법 iterator 말고도.. 
		//상향된 for문
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("spring");
		set.add("jsp");
		set.add("css");
		set.add("html");
		set.add("java");//중복
		
		set.size();//5
		
		System.out.println("상향된 for문");
		for(String element : set) {
			System.out.println(element);//넣은순서와 꺼내는순서가 다를수있다.. 보장되지않음. 
		}
		
		System.out.println("Iterator 사용하여 전체탐색");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		
		System.out.println("forEach 메소드 사용하여 전체탐색");
		set.forEach( (e)-> System.out.println(e) );
		
		
	}
}
