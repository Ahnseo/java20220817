package ch06.lecture.p09getset;

public class MyClass01 {
	private int age;
	
	//getter 메소드
	public int getAge() {
		return age;
	}
	
	//setter 메소드
	public void setAge(int age) {
		if( age > 0) {
		this.age = age;
		}
		
	}
	
}
