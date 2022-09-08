package ch11.book.s110601;

public class ClassExam {
	//getClass()  getName()
	//어디선가 내가 만든 클래스를 뜯어볼수있다...
	//이어지는 Annotation 공부
	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 =Car.class.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("java.lang.String");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Car {
	private String model ="현대";
	private String color ="black";
	 
}

