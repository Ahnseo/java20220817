package ch03.book;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		//대입연산자
		int result = 0;
		result += 10;
		System.out.println("result=" + result); //result = result + 10 => 10
		
		result -= 5;;
		System.out.println("result=" + result); // 10 - 5  = 5
		
		result *= 3;
		System.out.println("result=" + result); //5 * 3 = 15
		
		result /= 5;
		System.out.println("result=" + result); //15 / 5 = 3
		
		result %= 3;
		System.out.println("result=" + result); //3 % 3 = 0
		
		
	}
}
