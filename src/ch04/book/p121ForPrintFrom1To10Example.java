package ch04.book;

public class p121ForPrintFrom1To10Example {
	public static void main(String[] args) {
		System.out.println("1~10까지");
		for( int i = 1; i <= 10; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("1~5까지");
		for(int i=1; i<=5; i++ ) {	
			System.out.println(i);
		}
		
		System.out.println("5~10까지");
		for(int i = 5; i<=10; i++)
			System.out.println(i);
		
		System.out.println("5->1까지");
		for(int i = 5; i > 0; i-- ) {
			System.out.println(i);
		}
		
		System.out.println("10->5까지");
			for(int i =10; i >= 5; i--) {
				System.out.println(i);
		}
	}
}
