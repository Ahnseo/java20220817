package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		
		//Teacer/src/pic/02참조타입.png 참고
		
		int[] a = new int[] {3, 4, 5};
		int[] b = {99, 100, 101};
		
		a[0] = 33; //a[0]에 33을 넣었다면, 
		System.out.println(a);
		
		int[] c = a;
		System.out.println(c[0]);
		
		c[2] =1000;
		System.out.println(a[2]);//1000 출력  .. ㅇㅇ
		
		
		
		
		
 		
	}
}
