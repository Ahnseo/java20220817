package ch07.review.excersice.Ayong;

public class Child extends Person {
	//필드
		public int x=200;
		
		//생성자
		public Child(int x) {
			super();
		}
		//메소드
		public void method2() {
			System.out.println("child - method2");
		}
		
		@Override
		public void method1() {
			System.out.println("child - method1");

		}
}


