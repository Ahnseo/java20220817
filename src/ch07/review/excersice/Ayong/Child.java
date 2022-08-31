package ch07.review.excersice.Ayong;

public class Child extends Person {
	//필드
		public int x=200;
		//메소드
		public void method2() {
			System.out.println("child - method2");
		}
		
		@Override
		public void method1() {
			System.out.println("child - method1");

		}
}


