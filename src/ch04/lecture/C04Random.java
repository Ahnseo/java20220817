package ch04.lecture;

public class C04Random {
	public static void main(String[] args) {
		
		//Math.random() : 0 ~ 1미만의 double 값 리턴
//		double a = Math.random();  0.0 <= a < 1
//		System.out.println(a);
//		
		//주사위 만들기
//		System.out.println((int)((Math.random())*6)+1);
		// Integer 형 변환 , 6곱하고 +1 하고
		
		
		int x = (int)((Math.random())*6) + 1; 
		
		if(x==1){
			System.out.println("주사위 1 입니다");
		}else if(x==2) {
			System.out.println("주사위 2 입니다");
		}else if(x==2) {
			System.out.println("주사위 3 입니다");
		}else if(x==2) {
			System.out.println("주사위 4 입니다");
		}else if(x==2) {
			System.out.println("주사위 5 입니다");
		}else {
			System.out.println("주사위 6 입니다");
		}
		System.out.println("집에 가자!!!");
	}
}
