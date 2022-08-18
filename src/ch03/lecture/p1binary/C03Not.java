package ch03.lecture.p1binary;

public class C03Not {
	public static void main(String[] args) {
		//논리부정연산자 (not) : !
		//피연산자는 boolean
		//연산결과도 boolean, 피연산자를 반대값으로 (true -> false, false ->true)
		
		boolean a = true;
		boolean b = false;
		
		boolean c = !a;
		boolean d = !b;
		
		System.out.println(a); //t	
		System.out.println(b); //f
		System.out.println(c); //f
		System.out.println(d); //t
		
	}
}
