package ch07.lecture.p02polymorphism;

public class C07PolyMorphism {
	public static void main(String[] args) {
		
		SuperClass4 o1 =new SuperClass4();
		o1.method1();
		o1.method2();
		o1.method3();
		
		SubClass41 o2 = new SubClass41();
		o2.method1();
		o2.method2();
		o2.method3();
		
		SuperClass4  o3 = new SubClass41(); //상속 (다형성,자동형변환)
		o3.method1();	//Override 
		o3.method2();
		o3.method3();
		
		SuperClass4  o4 = new SubClass42();
		o4.method1();	//Override
		o4.method2();	//Override
		o4.method3();
		System.out.println();
		
		someMethod1(new SubClass41()); //SubClass42 = SubClass42
		System.out.println();
		
		someMethod2(new SubClass41());  //SuperClass4 > SubClass42
		System.out.println();
		
		someMethod2(new SubClass42());  //SuperClass4 > SubClass42
		
	}
	/** 메소드 속의 메소드
	 * someMethod1 실행할 때, 파리미터 SubClass41(클래스)의 object(클래스명) 인스턴스를 만들고,
	 * object(인스턴스)의 메소드를 호출하도록
	 */
	private static void someMethod1 (SubClass41 object) {
		System.out.println("###someMethod1 실행");
		object.method1();
		object.method2();
		object.method3();
	}
	private static void someMethod2 (SuperClass4 object) {
		System.out.println("#######someMethod2 실행");
		object.method1();
		object.method2();
		object.method3();
	}
}
