package ch06.book.p213;

public class CarExam {
	public static void main(String[] args) {
		
		//this() 
		// () 안에 호출
		
		Car car1 = new Car();
		System.out.println("car1.campany : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.campany : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.campany : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.campany : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}
}
