package ch06.lecture.p01field;

public class C04Field {
	public static void main(String[] args) {
		
		MyClass03 c1 = new MyClass03();
		MyClass03 c2 = new MyClass03();
		
		System.out.println(c1.color);
		System.out.println(c2.color);
		
		c1.color ="red";
		
		System.out.println(c1.color); //서로 다른 인스턴스라서.
		System.out.println(c2.color); //서로 다른 인스턴스라서.
		
		//초기값 확인
		System.out.println(c1.name); 
		System.out.println(c1.age);
		System.out.println(c1.hasCar);
		
	}
}
