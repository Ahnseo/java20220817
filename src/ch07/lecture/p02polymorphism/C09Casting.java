package ch07.lecture.p02polymorphism;

public class C09Casting {
	public static void main(String[] args) {
		
		/** 안전한 강제 형변환  :instanceof 
		    안전한 casting 방법 :instanceof
		    
		 	instanceof 연산 결과 : boolean
			좌항: 참조변수
			우항: 타입명(클래스, 인터페이스)
		*/
		SuperClass4 o1 = new SubClass41();
		SubClass41 o2 = (SubClass41) o1; //SuperClass4 객체를 ->SubClass41로 변환
		SuperClass4 o3 = new SubClass42();
		
		System.out.println(o3 instanceof SubClass42); // true   SubClass42 = SubClass42
		System.out.println(o3 instanceof SuperClass4); // true  SubClass42 < SuperClass4
		System.out.println(o3 instanceof SubClass41); // false  SubClass42 != SubClass41
		
		if (o3 instanceof SubClass41) { // false 
		SubClass41 o4 = (SubClass41) o3;  //xxxxxxx
		}
		
		System.out.println("프로그램 종료");
	}
}
