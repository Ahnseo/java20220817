package ch06.book.excercise.p14;

public class App {
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong", null, 0);
		Member user2 = new Member("강자바", "gang", null, 0);
		
		System.out.print(user1.name);
		System.out.println(user1.id);
		
		System.out.print(user2.name);
		System.out.println(user2.id);
		
	}
}
