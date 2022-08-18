package ch03.book;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;  // double 실수 연산 사용하니까 .. 결과가 딱 0.3 이 안됨
		int number = 7;
		
		double result = apple - number*pieceUnit; // 결과값이 0.3 일 되길 ..
		
		System.out.println(result);
		
	}
}
