package ch11.lecture.p03String;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1 = "hashcode is code of instance";
		String t1 = s1.replace("code", "코드");
		System.out.println(t1); //원문은 그대로 있음
		
		//replaceAll() : 패턴으로 바꾸고싶을때 사용
		String t2 = s1.replaceAll("code", "코드");
		System.out.println(t2);
		
		// e 로 끝나는 4글자를 바꾸겠따   
		// regular expression (=regex) ,정규식표현
		//                         .{3}e  
		String t3 = s1.replaceAll(".{3}e", "코드");
		System.out.println(t3);
		
		
	}
}
