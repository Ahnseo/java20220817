package ch07.book.s070804;

public class AnimalExam {
	public static void main(String[] args) {
		
		Dog dog = new Dog();		
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//다형성, 자동 타입 변환
		Animal animal = null;
		
		animal = new Dog(); //Animal class > Dog Class 
		animal.sound();
		
		animal = new Cat(); //Animal class > Cat Class 
		animal.sound();
		System.out.println("-----");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
		
	}


}
