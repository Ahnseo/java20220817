package ch06.lecture.p02constructor;

public class C01Constructor {
	public static void main(String[] args) {
		//생성자 constructor
		//생성자는 여러개 만들수있음. 
		//생성자명 = 클래스명
		//클래스명이 같지만, 파라미터에 따라 참조됨
		//생성자가 하는일 : 인스턴스 생성시 초기화 하는일
		
		MyClass01 c1 = new MyClass01();	//파라미터가 없는 클래스를 참조함
		c1.name ="maverick";
		
		MyClass01 c2 = new MyClass01();	
		c2.name ="hackman";
		
		MyClass01 c3 = new MyClass01();	
		c3.name ="bob";
		
		//이렇게 하고싶다.
		//새로운 인스턴스 클래스를 만들때, 파라미터 값입력으로 코드간결하게
		MyClass01 c4 = new MyClass01("pheonix");	
		System.out.println(c4.name);
		
		MyClass01 c5 = new MyClass01("goose");
		System.out.println(c5.name); 
	}
}
