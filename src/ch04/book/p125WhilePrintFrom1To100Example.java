package ch04.book;

public class p125WhilePrintFrom1To100Example {
	public static void main(String[] args) {
//     while 문 
//     1부터 10까지 출력
		
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("=====");
		
		int sum =0;
		int i = 1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
