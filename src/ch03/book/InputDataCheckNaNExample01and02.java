package ch03.book;

public class InputDataCheckNaNExample01and02 {
	public static void main(String[] args) {
		String userInput = "NaN"; //NaN : Not a Number
		double val = Double.valueOf( userInput );
//		double val = 2000.0; //NaN 이외 값을 갖는다면 , else 문으로 실행되겠지..
		
		double currentBalance = 10000.0;
		
//		currentBalance += val; //Double.valueOf( userInput );에의해 NaN 이됨
//		
//		System.out.println(currentBalance);
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 알수없음");
			
		}else {
			currentBalance += val;
			System.out.println(currentBalance);
		}
	}
}
