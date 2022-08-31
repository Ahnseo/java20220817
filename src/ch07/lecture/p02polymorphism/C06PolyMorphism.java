package ch07.lecture.p02polymorphism;

public class C06PolyMorphism {
	public static void main(String[] args) {
		//다형성, 자동형변환
		/**새로운 클래스를 o1 선언하고, 앞으로 main 메소드안에서 .o1 을 쉽게 불러냄*/
		SubClass3 o1 = new SubClass3();
		
		SuperClass3 o2 = o1; //o  (부모클래스 > 자식클래스)
		
		System.out.println(o2 == o1); //true
		System.out.println(System.identityHashCode(o1)); //주소 : 1227229563
		System.out.println(System.identityHashCode(o2)); //주소 : 1227229563

		System.out.println("-------------------");
		
		o1.method1();
		/**o2 => o1 이므로, 실제로 o1 (자식클래스) 의 Override 메소드가 실행됨 */
		o2.method1();// 실제 인스턴스( o2 -> 'o1' )의 메소드가 실행됨. 이부분이 중요함 
		
		
		System.out.println("-------------------");
		
		SuperClass3 o3 = new SuperClass3();
		o3.method1();
		
	}
}
