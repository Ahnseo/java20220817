package ch08.book.excersice.p5;

public class ActionExam {
	public static void main(String[] args) {
		
		//Action 익명구현객체 생성, 
		
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("Action 익명구현객체 생성");		
			}
			
		};
		action.work();
		
	}
}
