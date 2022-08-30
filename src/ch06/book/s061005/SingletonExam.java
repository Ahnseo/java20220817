package ch06.book.s061005;

public class SingletonExam {
	public static void main(String[] args) {
		/** 
		 * 생성자 private 클래스
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		*/
		
		/**클래스 메소드로 참조*/
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		}else {
			System.out.println("obj1 != obj2");
		}
	}
}
