package ch13.lecture.p03Bound;

public class C01Bound {
	public static void main(String[] args) {
		MyClass1<Object> o1 = new MyClass1<>();
		MyClass1<String> o2 = new MyClass1<>();
		MyClass1<Number> o3 = new MyClass1<>();
		MyClass2<Integer> o4 = new MyClass2<>();
		
		MyClass2<Number> o5 = new MyClass2<>();
		MyClass2<Integer> o6 = new MyClass2<>();
		MyClass2<Double> o7 = new MyClass2<>();
		
//		MyClass2<String> o8 = new MyClass2<>(); //x  관계없는 타입 변환 안됨
//		MyClass2<Object> o8 = new MyClass2<>(); //x  상위 타입 변환 안됨
	}
}
//'제한된' 타입 파라미터 ex) <T extends Number>
//Bounded type parameter
class MyClass2<T extends Number>{ //특정 타입의 메소드를 사용하고싶다면, ex) <T extends Number>
	private void method1(T parameter) {
		parameter.doubleValue();
		parameter.intValue();
		parameter.byteValue();

	}
}

class MyClass1<T>{
	public void method1(T parameter) {
		parameter.toString();// Object 메소드는 다 쓸수있지.
		parameter.equals(null);// Object 메소드는 다 쓸수있지.
		parameter.hashCode();// Object 메소드는 다 쓸수있지.
		
//		parameter.doubleValue();//x
		

	}
}
