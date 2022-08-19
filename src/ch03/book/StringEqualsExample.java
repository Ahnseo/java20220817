package ch03.book;

public class StringEqualsExample {
	public static void main(String[] args) {
		//String .equals 메소드
		
		String strVal1 = "안서정";
		String strVal2 = "안서정";
		
		String strVal3 = "안";
		String strVal4 = "서정";
		String strVal5 = strVal3 + strVal4;
		
		System.out.println( strVal1 == strVal2 );
		System.out.println( strVal1 == strVal5 ); //false 나옴. ( == , != 사용금지 )
		System.out.println();
		System.out.println( strVal1.equals(strVal2));
		System.out.println( strVal1.equals(strVal5));
		
	}
}
