package ch10.book;

public class s1003 {
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("java.lang.String2");
			
		}catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
