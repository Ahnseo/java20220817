package ch15컬렉션프레임워크.lecture.p04SortedSet;

import java.util.TreeSet;

public class C05Comparator {
	public static void main(String[] args) {
		//comparator 또는 comparable을 적용안했다면, 컴파일 오류 나는데,
		// C06Comparable  다음 장에서 해결해보자
		TreeSet<Book> books = new TreeSet<>();
		books.add(new Book("java", 100));
		books.add(new Book("css", 50));
		books.add(new Book("html", 300));
		
		System.out.println(books);
	}
}
