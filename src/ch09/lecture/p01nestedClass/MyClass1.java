package ch09.lecture.p01nestedClass;

public class MyClass1 {
	//중첩 클래스 : 클래스 안에 클래스
	
	//인스턴스 중첩 클래스
	class NestedClass{
		//필드
		//생성자
		//메소드
	}
	//스태틱 중접 클래스
	class StaticNestedClass{
		//필드
		//생성자
		//메소드
	}
	
	//메소드 안에 클래스, 이것 또한 클래스중첩가능
	public void method() {
		class LocalClass1{
			//필드
			//생성자
			//메소드
		}
		class LocalClass2{
			//필드
			//생성자
			//메소드
		}
		
	}
}
