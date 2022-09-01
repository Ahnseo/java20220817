package ch07.book.s070502;

public class sportsCar extends Car {
	
	@Override
	public void speedUp() {
		speed =10;
	}
	
	/** final메소드 재정의 불가능
	public void stop() {
		System.out.println("차가 멈춤");
		speed = 0;
	}
	*/
}
