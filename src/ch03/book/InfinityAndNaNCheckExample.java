package ch03.book;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
//		infinity :무한대
//		NaN :값이 없음
		
		
		int x = 5;
		double y = 0.0;
		
		double z = x/y;
		
//		double z =x%y;
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
	}
}
