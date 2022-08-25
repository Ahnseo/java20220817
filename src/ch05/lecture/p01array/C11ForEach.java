package ch05.lecture.p01array;

public class C11ForEach {
	public static void main(String[] args) {
		//향상된 for문(enhanced for, for-each)
		
		int[] a = {5,7,9,11};	
		
		for(int item: a) { //index 필요없이 item만 알고싶을때, 간결하게 사용
			System.out.println(item);
		}
	}
}
