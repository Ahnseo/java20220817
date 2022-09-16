package ch15컬렉션프레임워크.lecture.p04SortedSet;

import java.util.TreeSet;

public class C04Comparator {
	public static void main(String[] args) {
		//좀 중요한 이야기, 객체가 큰지 작은지는 어떻게 알까? 
		//             아니, 내가 의도해서 바꿀수있을까? 
		
		//Comparator interface  : 두개의 파라미터 (t1, t2)를 받고 int값 리턴
		//                        t1 > t2  -> 리턴 int 양수
		//					      t1 = t2  -> 리턴 int 0
		//     					  t1 < t2  -> 리턴 int 음수
		
		TreeSet<Book> books = new TreeSet<>((b1, b2) -> b2.getPrice() - b1.getPrice());
		books.add(new Book("java", 1000));
		books.add(new Book("css", 500));
		books.add(new Book("jsp", 700));
		
		System.out.println(books);
		
		System.out.println(books.first());
		System.out.println(books.last());
	}
}

class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + ":" + price;
	}
}
