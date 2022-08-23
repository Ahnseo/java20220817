package ch04.lecture.p02method;

public class C01Method {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		//call method (invoke method) : 함수호출 
		method1(); //함수호출 
		
		System.out.println(4);
		method1();
		method1();
		
		System.out.println(5);
		method2();
		
		System.out.println(6);
		method2();
		method2();
	}
	
	//메소드 (method)
	public static void method1() {
		   //메소드 : 메소드명 (괄호) {코드블럭}
		System.out.println('a');
		System.out.println('b');
		System.out.println('c');
		
	}
	
	//연습. method2를 작성하고 main 에서 method2를 호출하는 코드 작성
	
	public static void method2(){
		System.out.println("서정");
	
	}
}
