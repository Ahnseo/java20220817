package ch11.lecture.p01object;

//extends Object
public class C03Object extends Object {
	public static void main(String[] args) {
		//Object 는 내가 만든 클래스에도 상위 클래스이다.
		
		Object b1 = new Book();
		Object b2 = new Book();
		
		//Object.equals
		System.out.println(b1.equals(b2));//f 참조값 다름
		System.out.println(b2.equals(b1));//f
		System.out.println(b1.equals(b1));//t 참조값 같음
		System.out.println(b2.equals(b2));//t
		
		Object b3 = new Book(333);
		Object b4 = new Book(333);
		Object b5 = new Book(777);
		
		System.out.println(System.identityHashCode(b3));
		System.out.println(System.identityHashCode(b4));
		System.out.println(System.identityHashCode(b5));
		
		System.out.println(b3.equals(b4));
		
		System.out.println(b3.equals(b5));
	}
}

//class Book extends Object
class Book extends Object {
	private int code;
	
	Book() {
		
	}
	
	Book(int code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book o = (Book) obj;
			
			if (obj != null) {
				return this.code == o.code;
			}
			
		}
		return false;
	}
}
