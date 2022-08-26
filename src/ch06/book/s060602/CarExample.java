package ch06.book.s060602;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성
		
		Car myCar = new Car();
		
		//필드 값 읽기
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println("최대속도 : " + myCar.maxSpeed); //350
		System.out.println("현재속도 : " + myCar.speed);    //0
		
		//필드값 변경
		
		myCar.speed =60;
		System.out.println("현재속도 : " + myCar.speed); //60
		
	}
}
