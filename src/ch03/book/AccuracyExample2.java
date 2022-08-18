package ch03.book;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple * 10 ;   //int 사용
		int number = 7;				     //int 사용
		int temp = totalPieces - number; //int 사용
		
		double result = temp/10.0;
		
		System.out.println(result); //정확한 계산은 정수 연산으로 해야함
	}
}
