package ch08.book.s080503;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};

	public void run() {
		
		for(Tire tire : tires) {
			tire.roll();
		}
		
	}
}
	
	

