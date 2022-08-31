package ch06.lecture.p04Static;

public class C01Static {
	public static void main(String[] args) {
		// Static :  인스턴스를 만들지않고 , 클래스를 사용할때 
		// *외부 클래스의 인스턴스 생성없이 내부 클래스를 접근하기 위한 용도*
		
		//스태틱 메소드 호출 -> 스태틱필드 -> 스태틱메소드 적용 
		
		//스태틱맴버 : 스태틱필드 + 스태틱메소드   , 인스턴스맴버에 참조 불가능 ㅌㅌㅌ
		//인스턴스맴버 : 인스턴스필드 + 인스턴스메소드, 스태틱맴버에 참조 가능.....

		
		MyClass01 c1 = new MyClass01("coyote");
		System.out.println(c1.name);
		
		MyClass01 c2 = new MyClass01("phoenix");
		System.out.println(c2.name);
		
		c1.company = "topGun";
		System.out.println(c1.company);// 오호 ..
		System.out.println(c1.name);
		
		System.out.println(c2.company);
		System.out.println(c2.name);
		
		c1.company = "butterfly";
		
		System.out.println(c1.company);
		System.out.println(c2.company);
		
		c1.name = "Fire";
		System.out.println(c1.name);
		System.out.println(c2.name);
		
		
		MyClass01.company = "Cracker";
		System.out.println(c1.company);//x 이렇게 사용 x
		System.out.println(c2.company);//x 이렇게 사용 x
		System.out.println(MyClass01.company); //  이렇게 사용한다. 클래스의 정보니까.
		System.out.println();
		
		MyClass01.printCompany();
		c1.printCompany(); //이렇게 바로 손쉽게 사용한다.
		
	}
}
