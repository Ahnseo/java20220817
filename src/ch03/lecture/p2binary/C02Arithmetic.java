package ch03.lecture.p2binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		// 사용하는 자료형 주의하여 선택하기
		// 오버플로우
		
		int i = 10_0000_0000;
		int j = 10_0000_0000;
		
		int k = i + j;
		System.out.println(k);
		
		k = k + i ;
		System.out.println(k); //오버플로우 
		
		long x = 10_0000_0000L;
		long y = 10_0000_0000L;
		long z = x + x + y;
		System.out.println(z);
		
	}
}
