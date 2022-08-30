package ch06.lecture.p04Static;

public class MyClass03 {	
	//인스턴스 필드
	String name;
	
	//스태틱필드
	static String company ="topGun";
	
	//생성자
	public MyClass03(String name) {
		this.name =name;
	}
	//인스턴스 메소드
	void printName() {
		System.out.println(this.name);
	}
	//이렇게 객체에 객체  접근가능.
	void someInstanceMethod() {
		System.out.println(this.name);
		this.printName();
		printName();
	}
	
	void showCompany() {
		//인스턴스 맴버에서 스태틱 맴버 접근 가능
		System.out.println(company);
	}
	
	//스태틱 메소드 
	//사용 안됨. 인스턴스 맴버에 접근 불가능
	static void  printCompany() {
		System.out.println(this.name);
	}  
	
	
	
}
