package ch06.book.s061504.Annotation;

//Service Class
public class Service {
	@PrintAnnotation
	private void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")  //value = "*" 적용
	private void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value = "#", number = 20)
	private void method3() {
		System.out.println("실행 내용3");
	}
}
