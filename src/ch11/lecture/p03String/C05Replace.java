package ch11.lecture.p03String;

public class C05Replace {
	public static void main(String[] args) {
		//String	replace​(char oldChar, char newChar)	
		//: Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		
		String s1 ="coyote";
		s1.replace('o', 'z');
		System.out.println(s1); // 원본이 바뀐게아니다
		
		String s2 = s1.replace('o', 'z');
		System.out.println(s2);// 변수에 치환하여 출력하자
		
		String s3 = "hashcode is code of";
		s3.replace("code", "KOCE");
		System.out.println(s3); // 원본이 바뀐게아니다
		
		String s4 = s3.replace("code", "KOCE");
		System.out.println(s4);// 변수에 치환하여 출력하자
	}
}
