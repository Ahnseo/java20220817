package ch07.book.s070401;

public class ComputerExam {
	public static void main(String[] args) {
		
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적: "+ calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		//Override 
		//areaCircle() 메소드 재정의 함
		System.out.println("원면적: "+ computer.areaCircle(r));
		System.out.println();
	}
}
