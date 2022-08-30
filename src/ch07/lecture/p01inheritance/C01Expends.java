package ch07.lecture.p01inheritance;

public class C01Expends {
	public static void main(String[] args) {
		
	// 맴버가 상속됨
	// 메소드 상속에 초점을 두자
	
	SuperClass01 c1= new SuperClass01();
	SubClass01 c2 = new SubClass01();
	
	c1.age =33;
	System.out.println(c1.age);
	c1.method1();
	
	c2.age=20;
	System.out.println(c2.age);
	c2.method1();
	
	}
}
