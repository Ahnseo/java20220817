package ch11.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		
		System.out.println(o1.toString());//클래스명 @ 16진법
		System.out.println(o2.toString());//클래스명 @ 16진법
		
		Object o3 = new Book(300);
		Object o4 = new Book(400);
		System.out.println(o3.toString());
		System.out.println(o4.toString());
		
		Object o5 = new String("java");
		Object o6 = new String("java");
		System.out.println(o5.toString()); // 재정의 했기 때문에 java 출력
		System.out.println(o6.toString()); // 재정의 했기 때문에 java 출력
	}
}


