package ch07.book.s070703;

public class CarExam {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for ( int i = 1; i<=5 ; i++){
			int problemLocation = car.run();
			
			if(problemLocation != 0) { //car.run : true 달린다
				System.out.println(car.tires[problemLocation - 1].location + "hankookTire로 교체");
				car.tires[problemLocation-1]=
						new HankookTire(car.tires [problemLocation - 1].location, 15);
	ddfsdfasdgasdgasdgasdg
			}
			System.out.println("---------------------------------------------");
		}
	}
}