package ch13.lecture.p01generic;

public class C07Generic {
	public static void main(String[] args) {
		
	}
}
//타입 파라미터는 여러개 작성가능
//타입 파라미터 관습 : (의미있는) 대문자 1개.(필요하면 숫자를 붙일수도, T1 , T2, T3 ..)
//					 : class명을 넣어, class를 타입으로 받을 수 있다.

class MyClass<T, U>{
	
	private T val1;
	private U val2;
	
	public void method1(T t) {
		// TODO Auto-generated method stub

	}
	public T method2(U u) {
		// TODO Auto-generated method stub
		return val1;

	}
	private U method3() {
		// TODO Auto-generated method stub
		return val2;
	}
	
	
}