package ch02.book;

public class CastingExample {
	public static void main(String[] args) {
		// 타입 강제 변환
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue); // 문자로 바뀌겠다

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue); // 값이 작으니 담을수있겠지

		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 이렇다면..
		System.out.println(intValue); // 소수점 탈락 , 3 출력일거야
	}
}
