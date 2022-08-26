package ch06.book.s060704;

public class CarExample {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("자가용", "블랙");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car(100);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();
		
		Car car5 = new Car("자가용","블랙",80);
		System.out.println(car5.company);
		System.out.println(car5.model);
		System.out.println(car5.color);
		System.out.println(car5.maxSpeed);
		System.out.println();
	}
}
