package ch08.book.excersice.p3;

public class SoundableExam {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());

	}
	
	public static void main(String[] args) {
		printSound(new Cat()); // Cat 인스턴스를 넣음
		printSound(new Dog()); // Dog 인스턴스를 넣음
	}
}
	

class Cat implements Soundable{
	@Override
	public String sound() {
		return "야옹";
	}
}
class Dog implements Soundable{
	@Override
	public String sound() {
		return "멍멍";
	}
}
