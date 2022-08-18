package ch02.book;

public class PromotionExample {
	public static void main(String[] args) {
		//타입 자동 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = (int)charValue;
		System.out.println(intValue); //정수 출력이네 ..?
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue); // 소수점 까지 나오네 ..?
		
		
	}
}
