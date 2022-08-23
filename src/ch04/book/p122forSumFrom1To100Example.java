package ch04.book;

public class p122forSumFrom1To100Example {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		for(i = 1 ; i <= 100; i++) {
			sum += i;			
		}
		
		System.out.println("1 부터 100 까지의 합: " + sum);
		System.out.println("1 부터 " + (i - 1) + " 까지의 합: " + sum ); 
		                            //(i - 1) : int i 를 for문 밖에 선언해야 쓸수있음.
	}
}
