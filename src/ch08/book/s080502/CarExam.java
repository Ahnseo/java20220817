package ch08.book.s080502;

public class CarExam {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new HankookTire();
		myCar.run();
		
		
	}
}
