package ch07.book.s070804;
/**abstract*/
public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	/**abstractMethod*/
	public abstract void sound();
		
	
}
