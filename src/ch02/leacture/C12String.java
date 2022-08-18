package ch02.leacture;

public class C12String {
	public static void main(String[] args) {
		String a = "javaScript";
		String b = "vsCode";
		
		//substring :
		//startIndex(포함)부터 endIndex(불포함)까지의 문자열을 리턴합니다.
		String c = a.substring (0,4);
		String d = b.substring(2,6);
		
		System.out.println(c+d); //"javacode" 출력
	}
}
