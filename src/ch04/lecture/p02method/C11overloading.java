package ch04.lecture.p02method;

public class C11overloading {
	public static void main(String[] args) {
		method1(3, 5);
		
		method2 (9);//이름이 같은 method2 가 있지만, parameter가 1개있는 method2(int p1); 호출
		method2 (); //이름이 같은 method2 가 있지만, parameter가 없는 method2(); 호출
		method2 (3.14);//이름이 같은 method2 가 있지만, parameter가 1개있는 method2(double p1); 호출
		method2 (5); //이름이 같은 method2 가 있지만, parameter가 1개있는 method2(int p1); 호출
		
		method2 (5, 3.14);// method1(int p1, double p2) 호출
		method2 (3.14, 5);// method1(double p1, int p2) 호출
		
	}

	//Overloading : 메소드 명이 같아도 parameter의 type, 갯수, 순서가 다를 수 있음.
	//즉, 파라미터와 관련있고, 타입과는 관련없음.
	public static void method1(int p1, int p2) { // method1(int p1, int p2)
	}
	
	public static void method2() { //method2 파라미터 0개
		System.out.println("method2 파라미터 0개");
	}
	public static void method2(int p1) { //method2 파라미터 1개
		System.out.println("method2 파라미터 1개");
	}
	public static void method2(double p1) { //method2 파라미터 0개
		System.out.println("method2 (double p1) 1개");
	}
	public static void method2(int p1, double p2) { // method1(int p1, double p2)
		
	}
	public static void method2(double p1, int p2) { // method1(double p1, int p2)
		
	}
}
