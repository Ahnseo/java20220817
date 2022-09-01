package ch08.leacture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {				
		//인터페이스 구현과 객체 생성을 한번에 함.
		MyInterface1 o3 = new MyInterface1() {

			@Override
			public void method() {
				System.out.println("재정의한 메소드");			
			}
		
		};
		
		o3.method();
		
	}
}

//class MyClass1 implements MyInterface1{
//
//	@Override
//	public void method() {
//		// TODO Auto-generated method stub
//		
//	}
//	
// 인터페이스를 구현한 클래스가 있다면, //인터페이스 구현과 객체 생성을 한번에 할수있따
//}

interface MyInterface1{
	void method();
}