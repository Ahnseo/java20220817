package ch03.book;

public class DenyLogicOperatorExample {
	public static void main(String[] args) {
		//논리 부정 연산자
		
		boolean play = true;
		System.out.println(play);  //t
		
		play = !play;
		System.out.println(play); //f
		
		play = !play;
		System.out.println(play); //t
	}
}
