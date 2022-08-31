/**
다형성이란 하나의 타입에 여러 객체를 대입할 수 있는 성질로 이해하면 될 것이다.

다형성을 활용하면 기능을 확장하거나, 
객체를 변경해야할 때 타입 변경 없이 객체 주입만으로 수정이 일어나게 할 수 있다. 
또한 상속을 사용한다면 중복되는 코드까지 제거할 수 있으므로 
더욱 객체 지향 설계와 가까워질 수 있다.
*/
package ch07.lecture.p02polymorphism;

public class C01PolyMorphism {
	public static void main(String[] args) {
		// PolyMorphism : 다형성, 자동형변환 . 언제나 이루어짐. 
		//                알고 사용하면 코드가 간결해짐.
		//				  실제 인스턴스가 기능을 한다'는걸 기억하자
		
		SubClass1 o1 = new SubClass1();
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		
		SuperClass1 o4 = o1;
		
		// 거꾸로는 안됨
		SuperClass1 o5 = new SuperClass1();
//		SubClass1 o6 = new SuperClass1(); // x
//		SubClass2 o7 = new SuperClass1(); // x
		
//		SubClass1 o8 = o4; // x -> 강제로는 됨 
	}
}
