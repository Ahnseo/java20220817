package ch07.lecture.p02polymorphism;

public class C08PolyMorphism {
	public static void main(String[] args) {
		
		/**강제 형변환*/
		String string = "mac";
		System.out.println(string.length()); //3
		
		Object object = "coyote"; //Object class > String class 
		
		/**하지만,Object class 속에 length 메소드 없음
		  따라서, 컴파일 에러. */
//		System.out.println(o.length);
		
		
		/**강제 형변환은 위험하다. 컴파일 에러가 날 수 있다. */
		String string2 = (String) object; // Object객체 -> String객체로 강제 형변환 ( 큰 ->작은 )
		System.out.println(string2.length());//결과는 6 이지만, 사용하지말자.
		
	}
}
