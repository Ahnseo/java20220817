package ch04.lecture.p02method;

public class C12overloading {
	public static void main(String[] args) {
		double a =half(5.0);
		System.out.println(a); //2.5
		
		//Overloading : 메소드 명이 같아도 parameter의 type, 갯수, 순서가 다를 수 있음.
		//즉, 파라미터와 관련있고, 타입과는 관련없음.
		double b =half(5); // double타입 보단,  파라미터 5에 초점을 두고 호출되어, int type method 호출
		System.out.println(b); //2.0
		
		int c =half(5);
		System.out.println(b); //2.0
	}
	
	public static double half(double p1) {
		System.out.print("double 값 method 리턴 : ");
		return p1/2 ;
	}
	public static int half(int p1) {
		System.out.print("int 값 method 리턴 : ");
		return p1/2;
	}
	
	
}
