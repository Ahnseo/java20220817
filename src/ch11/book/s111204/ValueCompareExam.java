package ch11.book.s111204;

public class ValueCompareExam {
	public static void main(String[] args) {
		
		//Boxing 객체 내에서는 == 와 != 을 사용하지말자
		//직접 내부값을 언박싱해서 비교하거나, equals()메소드를 이용하자.
		
		//Boxing클래스(Integer,Double,..Boolean) 의 equals()메소드는 
		//내부값을 비교하도록 Override 되어있다.
		//java11 api
		//boolean	equals​(Object obj)	 :Compares this object to the specified object.
		
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: "+ (obj1==obj2));
		System.out.println("언박싱후 ==결과: "+ (obj1.intValue() ==obj2.intValue()));	
		System.out.println("equals()결과 : "+ obj1.equals(obj2));
		
		System.out.println();
		
		System.out.println("[-128~127 범위 내 값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.println("==결과: "+ (obj3==obj4));
		System.out.println("언박싱후 ==결과: "+ (obj3.intValue() ==obj4.intValue()));
		System.out.println("equals()결과 : "+ obj3.equals(obj4));
		
	}
}
