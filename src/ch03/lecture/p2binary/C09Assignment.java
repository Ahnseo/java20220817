package ch03.lecture.p2binary;

public class C09Assignment {
	public static void main(String[] args) {
		//대입연산자 : 오른쪽부터 연산
		
		int i = 3; 
		int j = 5;
		
		int k = i;
		System.out.println(k);
		
		k += j;    // k = k + j
		System.out.println(k);
		
		k -= i;
		System.out.println(k);
		
		k *= i; 
		System.out.println(k);
		
		k /=j; 
		System.out.println(k);
		
		k %=i; 
		System.out.println(k);
 	}
}
