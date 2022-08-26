package ch06.book.s060703;

public class KoreanExample {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "01022520505");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.phoneNum : " +k1.phoneNum);
		
		Korean k2 = new Korean("김자바", "01033299716");
		System.out.println("k2.name : "+ k2.name);
		System.out.println("k2.phoneNum : "+ k2.phoneNum);
	}
}
