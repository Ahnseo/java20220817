package ch04.book;

public class p124구구단 {
	public static void main(String[] args) {
		
		//for for
		
		for(int i=2; i<=9; i++) {
			System.out.println("<"+ i + "단>");
			
			for(int k=1; k<=9; k++) {
				System.out.println(i + " x " + k + " = " + (i*k));
			}
			System.out.println("-----");
		}			
	}
}
