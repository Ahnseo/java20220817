package ch08.book.s080505;

public class VehicleExam {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle; //강제 형변환
		
		bus.run();
		bus.checkFare();
		
	}
}
