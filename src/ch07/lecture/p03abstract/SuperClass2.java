package ch07.lecture.p03abstract;

/**abstract class*/
public abstract class SuperClass2 {
	
		
	/**abstract Method
	 * body 가 없는 메소드
	 * 상속받는 클래스가 꼭 구현해 주어야 함
	 * abstract Method 는 abstract class 안에서 사용
	 * */
		public abstract void cry();
			
		
		public void walk() {
			System.out.println("네발로 걷습니다");
		}
		
		public void eat() {
			System.out.println("먹이를 먹습니다");
		}
}
