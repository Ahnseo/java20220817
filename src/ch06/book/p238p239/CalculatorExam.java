package ch06.book.p238p239;

public class CalculatorExam {
	public static void main(String[] args) {
		
		//static field 와 static method 사용, 
		//instance가 없어도 클래스에 접근.
		
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println(result1);
		
		int result2 = Calculator.plus(10, 5);
		System.out.println(result2);
		
		int result3 = Calculator.minus(10, 5);
		System.out.println(result3);
	}
}
