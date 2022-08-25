package ch05.lecture.p03String;

public class C03null {
	public static void main(String[] args) {
		
		//null
		int[] a;
		String b; 
		String c = "java";
		a = null;//참조하는 객체가 없음
		b = null;//참조하는 객체가 없음
		
		System.out.println(c.length()); //4
		System.out.println(b.length()); // NullPointerException ,자주보는오류 , 객체가 없다는 것을 알고 문제해결하자.
	}
}
