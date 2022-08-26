package ch06.lecture.p03Method;

public class MyClass02 {
	
	//필드
	String name ;
	//생성자
	public MyClass02(String name) {
		this.name = name;
	}
	//메소드
	void printName() { //인스턴스 메소드 
		System.out.println(name);
	}
}
