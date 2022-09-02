package ch09.book.s090502;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");	
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	 void method1() {
		 //로컬변수 값으로 대입
		 RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");	
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 켭니다.");	
			}
		};
		
		localVar.turnOn();
	}
	 
	 //나중에 호출할 method2 다음 파일에 코드 작성시킬것임
	 void method2(RemoteControl control){
		 control.turnOn();
	 }
}
