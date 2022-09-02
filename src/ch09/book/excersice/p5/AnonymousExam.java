package ch09.book.excersice.p5;

public class AnonymousExam {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		
		anonymous.field.run();
		anonymous.method1();
		
		
//		Vehicle vehicle = new Vehicle() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		anonymous.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
				
			}
		}
				
				
		);
	}
}
