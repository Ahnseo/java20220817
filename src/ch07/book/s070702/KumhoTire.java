package ch07.book.s070702;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulateRotation; // 누적 회전수 1 증가
		if(accumulateRotation < maxRotation) {
				System.out.println(	location + " Tire수명: "+ (maxRotation - accumulateRotation) +"회");
				return true;
		}else {
			System.out.println("***" + location + " Tire 펑크***");
			return false;
		}
	}
}
