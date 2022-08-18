package ch02.leacture;

public class C08TypeConversion {
	public static void main(String[] args) {
		//타입 변환
		//자동 변환 : 작은 타입 -> 큰 타입
		//강제 변환 : 큰 타입 -> 작은 타입(Cast 연산 ,casting)
		
		//자동 타입 변환
		int a = 33;  //4byt
		short b = 55; //2byt
		
		a = b; //가능. 자동변환
		
		char c = '가';
		a = c; //ok
		
		long d = c; //ok	
//		short e = c; // 같은 2byt 이지만, 안됨
		
		float f = 3.14F;
		double g = f; //ok
		
		//정수타입 -> 실수타입 
		int h = 999;
		float i = h;
		double j = h;
		
		long k = 99999L;
		double m = k;
		
		//안되는 것들
		boolean n = true;
//		int o = n; //x  
		
		//강제 타입 변환
		long q = 999999L;  //8byt
//		int p =q; //x ,  4bye 
		int r = (int)q; // 강제 변환 
		System.out.println(r);//강제변환 됨
		
		q = 30_0000_0000L;
		r = (int)q ; //값을 잃을 수 있다
		System.out.println(r);
		
		//실수 타입 -> 정수 타입 ( 강제 변환)
		float s = 3.14F;
//		int t = s; //x
		int u = (int)s;
		System.out.println(u);
		
		double v =3.14;
		u = (int) v; // 소수점 이하 탈락
		System.out.println(u);
		
	}
}
