package ch06.book.s060804;

public class Calculator {
	//메소드 오버로딩 : 같은 메소드명을 여러번 사용하는 것
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width* width;
		
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
