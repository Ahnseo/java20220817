package ch10.lecture.p03exceptions;

public class C03Exception {
	public static void main(String[] args) {
		
		
		Class a;
		try {
			a = Class.forName("java.lang.String");
			System.out.println(a.toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a = Class.forName("java.lang.String"); //throws
		System.out.println(a.toString());
		
	}
}
