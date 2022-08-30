package ch06.lecture.p04Static;

public class MyClass02 {
	//instance field
	String name;
	
	//static field	
	static String company = "topgun";
	static int rank;
	
	// 연산을 하고싶을때
	static {
		int a =30;
		int b=90;
		rank = a*b;
	}
	static {
		
	}
	
	//생성자 ; 인스턴스 초기화
	public MyClass02 (String name) {
		this.name = name;
		
	
	}
}
