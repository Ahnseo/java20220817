package ch04.lecture.p02method;

public class C05Parameter {
	public static void main(String[] args) {
		method1(3);
//		method1(3.14);//x 
		method2(3.14);
		method2(5); // 정수를 double에 담아도 문제없음 ok
//		method2("3.14"); //x
		
		int a = 5;
		method1(a); //변수 치환 가능
		double b = 1.23;
		method2(b); //가능
		
		method3(1, 2, 3); //메소드3 호출
		
	}
	
		public static void method1(int param) {
		
		}	
		public static void method2(double param) {
			
		}
		public static void method3(int p1, int p2, int p3) { //파라미터 갯수대로 순서의 맞게, 호출시 입력해야함 
			
		}
	
}
