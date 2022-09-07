package ch11.lecture.p03String;

public class C02CharAt {
	public static void main(String[] args) {
	
	// char	charAt​(int index)	
	// :Returns the char value at the specified index.
	
	String s1 = "maverick";
	char c1 = s1.charAt(5);
	System.out.println(c1);
	System.out.println(s1.charAt(6));
	System.out.println(s1.charAt(7));
//	System.out.println(s1.charAt(8));  //StringIndexOutOfBoundsException 
	
	}
}
