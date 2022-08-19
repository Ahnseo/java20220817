package ch03.lecture.p2binary;

public class C05Comperison {
	public static void main(String[] args) {
		//비교연산자 
		//<, >, <=, >=, ++, !=
		//연산결과는 boolean
		//같은 타입만 연산가능
		
		int a = 8;
		int b = 5;
		
		boolean c = a < b;
		System.out.println(c);
		System.out.println(a < b);
		
		double d = 8.0;
		System.out.println(d < b);
		System.out.println(a == d);
		System.out.println((double)a == d);
		
		String e ="8";
		System.out.println(Integer.valueOf(e) == a);
		
		
		
		
	}
}
