package ch03.lecture.p2binary;

public class C04StringToNumber {
	public static void main(String[] args) {
		//String을 Number로 바꾸는 경우가 종종 있다.
		
		String a = "10";
		int b = 30;
		
		System.out.println(a+b); //1030
		
		int c = Integer.valueOf(a);
		System.out.println( b + c ); //40
		
		String d = "3.14";	
		double e = 9.8;
		System.out.println(Double.valueOf(d) / e); //Double 로 변경
		
		String f ="Infinity";
		String g ="NaN";
		
		System.out.println(Double.valueOf(f) + e); //Infinity
		System.out.println(Double.valueOf(g) + e); //NaN
	}
}
