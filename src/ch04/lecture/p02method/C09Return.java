package ch04.lecture.p02method;

public class C09Return {
	public static void main(String[] args) {
		long a = integerSum(1,10);
		System.out.println(a);// 1~10 사이의 정수의 합이 System.out.println(ㅁ);으로 출력 되도록
		
		long b = integerSum(1,100);
		System.out.println(b);// 1~100 사이의 정수의 합이 System.out.println(b);으로 출력 되도록
		
		long c = integerSum(50,200);
		System.out.println(c);// 50~200 사이의 정수의 합이 System.out.println(c);으로 출력 되도록
		//위를 만족하는 매소드 코드를 작성하자
		
	}	
	public static long integerSum(int p1, int p2) {
		
		long total = 0;
		for(int i = p1; i<= p2; i++) {
			total += i;
		}
		return total;
	}
	
}
