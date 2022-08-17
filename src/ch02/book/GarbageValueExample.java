package ch02.book;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte val1 = 125;
		int val2 = - 125;
		
		//overflow 현상
		for(int i = 0; i < 5; i++) {
			val1++;
			val2++;
			System.out.println("val1:" + val1 + "\t" + "val2:" + val2); //\t : tap 만큼 띄우기 
		}
	}
}
