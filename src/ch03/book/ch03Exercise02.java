package ch03.book;

public class ch03Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z =(++x) + (y--);
		System.out.println(z); //11 + 20
	}
}
