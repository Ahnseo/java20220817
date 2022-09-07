package ch11.lecture.p01object;

public class C02Equals {
	public static void main(String[] args) {
		
		//Object class  equals 메소드 :  타입 boolean
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.equals(o2)); //서로 다른 인스턴스
		System.out.println(o2.equals(o1)); //서로 다른 인스턴스 
		System.out.println(o1.equals(o1)); //자기 자신
		System.out.println(o2.equals(o2)); //자기 자신
		
		//String.equals : String클래스에서 equals메소드는 문자가 같은면, true/false 되도록 오버라이드 되어있음.
		Object o3 = new String("topgun");
		Object o4 = new String("topgun");
		System.out.println(o3.equals(o4)); //true , 실제인스턴스(String)에 equals메소드가 오버라이드 되었음
		System.out.println(o4.equals(o3));
		System.out.println(o3.equals(o3));
		System.out.println(o4.equals(o4));
		System.out.println(o3 == o4); //false , 다른 객체 이기때문.
				
		
	}
}
