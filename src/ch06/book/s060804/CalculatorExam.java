package ch06.book.s060804;

public class CalculatorExam {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형 넙이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("한 변의 길이 10 인 정사각형 넓이: " + result1);
		System.out.println("가로10, 세로20 인 직사각형 넓이: " + result2);
	}
	

}
