package ch06.lecture.p08singleton;

public class MyClass01 {
	
	private static final MyClass01 instance = new MyClass01();
	
	private MyClass01() {
		// TODO Auto-generated constructor stub
	} 
	
	public static MyClass01 getInstance() {
		return instance;
	}
	
}
