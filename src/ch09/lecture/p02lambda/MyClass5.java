package ch09.lecture.p02lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class MyClass5 {

	public static void main(String[] args) {
		//Interface IntConsumer  :  parameter에 int type, agument 1개를 받는 interface 
		//메소드명 accept
 		
		IntConsumer o1 = i -> System.out.println( i * i );
		o1.accept(3); // 제곱값 구하기  : 9
		o1.accept(4); // 제곱값 구하기  : 16
		o1.accept(10); // 제곱값 구하기  : 100
		
		DoubleConsumer o2 = d -> System.out.println( d / 2 );
		o2.accept(5); // 2.5 출력
		o2.accept(10); // 5.0 출력
		o2.accept(7); // 3.5 출력
	}
}
