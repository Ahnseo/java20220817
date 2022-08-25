package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		System.out.println(a[0]); //9
		
		a = changeItems(a);
		System.out.println(a[0]); 
	}

	private static int[] changeItems(int[] p1) {
		System.out.println(p1[0]);
		p1= new int[] {3,4,5};
		return p1;
		
	}
}
