package ch09.book.s090502;

public class AnonymousExam {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		
		anonymous.field.turnOn();
		anonymous.method1();
		
		anonymous.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("smart TV를 켭니다");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("smart TV를 끕니다");
				
			}
		});
	
	}
}
