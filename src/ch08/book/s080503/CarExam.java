package ch08.book.s080503;

public class CarExam {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println();
		
		myCar.tires[0]= new KumhoTire();
		myCar.tires[1]= new KumhoTire();
		
		myCar.run();
	}
}
