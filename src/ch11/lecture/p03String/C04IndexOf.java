package ch11.lecture.p03String;

public class C04IndexOf {
	public static void main(String[] args) {
		String s1 = "coyote";
		s1.indexOf("o"); // s1[1] -> 1 
		System.out.println(s1.indexOf("o")); //1
		System.out.println(s1.lastIndexOf("te"));
		
		String s2 = "hashcode is code Value for instance";
		System.out.println(s2.indexOf("code")); // 문자가 시작하는 첫번째 s2[4] 를 찾고 4 출력
		System.out.println(s2.lastIndexOf("instance"));
	}
}
