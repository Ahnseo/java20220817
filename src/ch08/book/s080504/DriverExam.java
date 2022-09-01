package ch08.book.s080504;

public class DriverExam {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi =  new Taxi();
		
		driver.drive(bus); //parameter 값은 ... Vehicle bus = new Bus(); 이고 bus.run(); 실행
		driver.drive(taxi); //parameter 값은 ... Vehicle taxi = new Taxi(); 이고 taxi.run(); 실행
 	}
}
