package ch02.leacture;

public class C11String {
	public static void main(String[] args) {
		// String : 문자열 , 참조타입(객체) ;필드와 메소드가 있음.
		//   +  (연결연산) 의 결과는 String. 
		
		// char : 문자 하나
		
		char a = '닭'; // 작은 따옴표
		String b = "닭"; //큰 따옴표
		String c = ""; //빈 문자열 가능
		String d = "   ";  //가능 
		
		// String : 문자열 , 참조타입(객체) ;필드와 메소드가 있음.
		String k = "bts";
		char l = k.charAt(0); //charAt 메소드 
		int m = k.charAt(1); //charAt 메소드 
		
		char n = k.charAt(0); //b
		char o = k.charAt(1); //t
		char p = k.charAt(2); //s
		
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
//		char q = k.charAt(-1);
//		System.out.println(q);
		
//		char r = k.charAt(3);  //IndexOutOfBoundsException 
//		System.out.println(r);
//		
		
		
		// length : 길이 리턴
		int s = k.length();
		System.out.println(s);
		
		String t = "javaScript";
		System.out.println(t.length());
		System.out.println(t.charAt(t.length()-1));
		
		//substring :
		//startIndex(포함)부터 끝까지의 문자열을 리턴합니다.
		//각각의 배열 이름 : index 
		String u = t.substring(0); //0번 인덱스 부터 끝까지를 리턴
		System.out.println(u);
		String v = t.substring(1); //1번 인덱스 부터 끝까지를 리턴
		System.out.println(v);
		String w = t.substring(2);
		System.out.println(w);
		
		//substing( int ,int )
		//startIndex(포함)부터 endIndex(불포함)까지의 문자열을 리턴합니다.
		System.out.println(t.substring(0, t.length()  ) );
		System.out.println(t.substring(0, t.length()-1) );
		System.out.println(t.substring(0, t.length()-6) );// 'java'만 출력
		System.out.println(t.substring(2, 4)); //'va' 만 출력
		
		
		
		
		
	}
}
