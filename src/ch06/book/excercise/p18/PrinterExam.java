package ch06.book.excercise.p18;

public class PrinterExam {
	public static void main(String[] args) {
		shopService obj1 = shopService.getInstance();
		shopService obj2 = shopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 shopService 객체 입니다");
		}else {
			System.out.println("다른 shopService 객체 입니다");
		}
	}
}
