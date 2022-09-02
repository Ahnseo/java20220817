package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> {
			int d = (int) (Math.random()*6) + 1 ;
			return d;
		};	
		int n1 = o1.method();
		System.out.println(n1); //변수에 담아서 출력
		System.out.println(o1.method()); //변수에 담지 않고 출력
		
		MyInterface6 o2 =() ->{
			return (int) (Math.random()*6) + 1 ;
		};
		System.out.println(o2.method());//변수에 담지 않고 출력 , 바로출력
		
		//return 생략 까지해서 출력 가능
		MyInterface6 o3 = () -> (int) (Math.random()*6) + 1 ;
		System.out.println(o3.method());
	}
	
}

interface MyInterface6 {
	int method();
}