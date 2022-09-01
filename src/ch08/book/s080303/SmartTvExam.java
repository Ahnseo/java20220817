package ch08.book.s080303;

public class SmartTvExam {
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		smartTv.turnOn();
		
		smartTv.setVolume(15);
		
		smartTv.setVolume(5);
		
		smartTv.setVolume(-1);
		
		smartTv.turnOff();
		
		smartTv.Search("132.432.123.111");
		
		smartTv.setMute(true);
		smartTv.setMute(false);
	}
}
