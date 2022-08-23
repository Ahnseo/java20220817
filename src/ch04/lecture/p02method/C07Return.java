package ch04.lecture.p02method;

public class C07Return {
	public static void main(String[] args) {
		
		System.out.println(1);
		method1();
		System.out.println(2);
		method2();
		method3();
		method4();
	}
	
	public static void method1() {
		System.out.println("가");
		if(true) {
			return; //'메소드 종료 역할' if 로 제어할 수도 있음
		}
		System.out.println("나");
	}
	
	public static int method2() {  //int 타입 method2
		return 3; 
	}	
	public static double method3() {  //double 타입 method3
		return 3.14; 
	}
	public static int method4() { //3.따라서 타입 int method4() 으로 설정, 근데 eclips가 오류 잡아줌 
		//return : 메소드 종료
		//		 : 오른쪽 값을 호출한 곳으로 반환 (return)
		//1.return으로 값을 반환 할때, 
		//2.메소드의 리턴 타입과 반환값의 타입이 일치해야함 
		
		return 5; // 3을 반환
	}
}
