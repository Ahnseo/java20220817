package ch07.book.s070803;

/**abstract 클래스*/
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰을 끕니다.");
	}
}
