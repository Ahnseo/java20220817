package ch07.lecture.p01inheritance;

public class SubClass05	extends SuperClass05 {

	@Override
	public void method1() {
		super.method1(); 
		System.out.println("추가한내용");
	}
	
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//		super.method1();
//	}
}
