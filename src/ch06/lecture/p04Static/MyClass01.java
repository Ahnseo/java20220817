package ch06.lecture.p04Static;

public class MyClass01 {
	// non static(=instance field) 
	String name;
	
	//static field (=class field) 공통정보가 됨
	static String company;
	
	
	public MyClass01(String name) {
		this.name = name;
	}
	
	// non static
	//instance Method
	void printName() {
		System.out.println(name);
	}
	
	//static method
	//class method
	static void printCompany() {
		System.out.println(company);
	}
}
