package ch11.lecture.p03String;

public class C01String {
	public static void main(String[] args) {
		String s1 = "new 연산자없이 객체생성";
		String s2 = "특별한경우로 만들수있다. byte배열,char배열 등등";
		
		char[] arr1 = {'a', 'b', 'c', 'd', '\u270D'};
		String s3 = new String(arr1);
		System.out.println(s3);
		
		String s4 = new String(arr1, 2, 2);
								//arr1[2]부터2개 출력
		System.out.println(s4);
		
		byte[] arr2 = {106, 97, 118, 97}; //아스키코드
		String s5 = new String(arr2);
		System.out.println(s5);
		
		String s6 = new String(arr2,    2,   2);
								//arr2[2]부터2개 출력
		System.out.println(s6);
		
				
		
	}
}	
