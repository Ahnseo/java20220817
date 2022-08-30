package ch06.book.s0614;

public class CarExam {
	public static void main(String[] args) {
		Car myCar = new Car();
		
//		myCar.getSpeed(-50);
		
		myCar.setSpeed(70);
		System.out.println("myCar.getSpeed() : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("myCar.getSpeed() : " + myCar.getSpeed());
		
		
	}
}
