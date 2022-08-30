package ch06.lecture.p09getset;

public class C01Getset {
	public static void main(String[] args) {
		//필드를 보호 (필드 비공개)
		//getter : 읽기 기능
		//setter : 쓰는 기능
		
		MyClass01 c1 = new MyClass01();
		/** private field 
		c1.age =30;
		System.out.println(c1.age);
		
		c1.age = -30;
		System.out.println(c1.age);
		*/

		c1.setAge(30);
		System.out.println(c1.getAge());
		
		c1.setAge(-30);
		System.out.println(c1.getAge());
		
		
	}
}
