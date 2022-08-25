package ch05.lecture.p03String;

public class C02New {
	public static void main(String[] args) {
		// new연산자 : 새 인스터스(객체) 의 참조값을 연산결과로 낸다.
		
		String str1 = new String("java");
		String str2 = new String("java");
		
		String str3 = "java"; //new 연산자 생략하고 string literal.
		//new 연산자 생략하고 string literal을 작성하는 이미 있는 참조값 사용됨.
		//스트링은 정말 많이사용해서 new연산자를 뺄수있게해줫음
		
		String str4 = "java";
		
	}
}
