package ch07.book.s070402;

public class SupersonicAirplaneExam {
	public static void main(String[] args) {
		
		SupersonicAirplane sa =new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly();
		sa.land();
		
	}
}
