package ch05.lecture.p03String;

public class C01String {
	public static void main(String[] args) {
		
		int a =3;
		int b =3;
		
		System.out.println(a == b);
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "ja";
		String s4 = "va";
		String s5 = s3 + s4;
		
		
		System.out.println(s1 == s2); //가리치는 객체가 같아서 true
		System.out.println(s1); //java
		System.out.println(s5); //java
		System.out.println(s1 == s5);//false !!
		
		System.out.println("참조값 s1: " + System.identityHashCode(s1)); //참조값 찾아보기
		System.out.println("참조값 s2: " + System.identityHashCode(s2)); //System.identityHashCode()
		System.out.println("참조값 s5: " + System.identityHashCode(s5));
		
		System.out.println(s1.equals(s5));  // content가 같은지 알고싶다~ .equals()
		System.out.println(s1.contentEquals(s5));
		//Teacher/src/pic/06문자열.png
	}
}
