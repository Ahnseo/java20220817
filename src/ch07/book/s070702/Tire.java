package ch07.book.s070702;

public class Tire {
	//부모 클래스 Tire
	public int maxRotation; //최대 회전수
	public int accumulateRotation; //누적 회전수
	public String location; //타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location =location;
		this.maxRotation = maxRotation;		
	}
	
	//메소드 
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
