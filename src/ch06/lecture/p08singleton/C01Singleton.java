package ch06.lecture.p08singleton;

public class C01Singleton {
	
	public static void main(String[] args) {
		
	//지금 클래스로, 인스턴스 하나만 만들고자 한다.	
	MyClass01 c1 = new MyClass01();
	MyClass01 c2 = new MyClass01();
	
	System.out.println(c1.getInstance());
	
	}
}
