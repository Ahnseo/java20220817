package ch16.lecture.book.s140601p713MethodReference.copy;

import java.util.function.IntBinaryOperator;

public class MethodReference {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//static method 참조
		operator = (x,y) ->  Calculator.staticMethod(x,y);
		System.out.println("결과:"+ operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과:"+ operator.applyAsInt(3, 4));
		
		Calculator obj = new Calculator(); //새로운 객체 생성하고, instance 메소드 사용
		operator = (x,y) ->  obj.instanceMethod(x,y);
		System.out.println("결과:"+ operator.applyAsInt(5, 6));
		
		operator = obj::instanceMethod;
		System.out.println("결과:"+ operator.applyAsInt(7, 8));
	}
}
