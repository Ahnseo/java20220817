package ch06.lecture.p02constructor;

public class C04Constructor {
	public static void main(String[] args) {
		//생성자 에 this. 키워드 넣었음
		
		MyClass04 c1 = new MyClass04("서정",30);
		System.out.println(c1.name);
		System.out.println(c1.age);
		
		MyClass04 c2 = new MyClass04("아름",32);
		System.out.println(c2.name);
		System.out.println(c2.age);
	}
}
