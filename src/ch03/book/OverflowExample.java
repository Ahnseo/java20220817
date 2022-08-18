package ch03.book;

public class OverflowExample {
	public static void main(String[] args) {
//		int x = 100_0000;
//		int y = 100_0000;
//		int z = x * y;
//		
//		System.out.println(z); // 오버플로우
		
		double x = 100_0000;
		double y = 100_0000;
		double z = x * y;
		
		System.out.println(z);
		
	}
}
