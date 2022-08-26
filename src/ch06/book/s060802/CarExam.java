package ch06.book.s060802;

public class CarExam {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//set gas 
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas(); //true 또는 false 역할만
		
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요없습니다.");
			
		}else {
			System.out.println("가스를 주입하세요.");
		}
		
		
	}
}	
