package ch05.lecture.p03String;

public class C04Garbage {
	public static void main(String[] args) {
		//Teacher/src/pic/07쓰레기.png
		int[] a = {3,4};
		a = new int[] {9,10};
		System.out.println(a);
	}
}
