package ch04.book;

public class p123ForFloatCounterExample {
	public static void main(String[] args) {
		
		//실수를 연산할 때, 우리가 예상한 값이 안 나올경우가 있다.
		
		for(float x = 0.1F; x <= 1.0F; x += 0.1F ) {
			System.out.println( x );
		}
	}
}
