package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = {9, 8};//    a의 heap 주소 id=23
		changeItems(a); //9    a의 heap 주소 id=23
		
	}

	private static void changeItems(int[] p1) {
		System.out.println(p1[0]);
		p1 = new int[] {3, 4}; //p1의 heap 주소 id=30
	}
	
}
