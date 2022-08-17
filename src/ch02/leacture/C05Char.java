package ch02.leacture;

public class C05Char {
	public static void main(String[] args) {
		//char : 2byte , character type 
		//하나의 문자 표현용
		
		char a = '가'; //문자 하나는 작은 따옴표
						//자바에서 여러글자는 큰따옴표
		char b = 'A';
		char c = 'a';
//		char d = '';//x 빈 문자는 안됨
		char e = ' '; //빈 문자열은 됨 
		String f =""; // ok
		
		char g = 65; //10진법
		System.out.println(g);
		char h = 44941; //10진법
		System.out.println(h);
		char i = '\uAF8D'; //16진법
		System.out.println(i);
		
	}
}
