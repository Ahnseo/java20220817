package ch07.lecture.p04final;

public class SuperClass2 {
	public void method1() {
		// TODO Auto-generated method stub

	}
	/**fianlMethod*/
	public final void method2() {
		// TODO Auto-generated method stub

	}
}
	
class SubClass2 extends SuperClass2{
		
	@Override
	public void method1() {
		// 재정의 됨
	}
	
//	private void method2() {
//		// 재정의 안됨
//
//	}
	
}
