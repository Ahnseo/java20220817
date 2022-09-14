package ch15컬렉션프레임워크.book.s150201p729;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysAsListExam {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","김자바");
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for (int value : list2) {
			System.out.println(value);
		}
		System.out.println();
		
		System.out.println("for문으로 전체탐색");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		
		System.out.println("향상된 for문으로 전체탐색");
		for (String item : list1) {
			System.out.println(item);
		}
		System.out.println();
		
		System.out.println("forEach로 전체탐색");
		list1.forEach((e)-> System.out.println(e));
		System.out.println();
		
		System.out.println("iterator로 전체탐색");
		Iterator<String> iterator = list1.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println();
		
	}
}
