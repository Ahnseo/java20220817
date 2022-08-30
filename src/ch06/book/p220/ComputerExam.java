package ch06.book.p220;

public class ComputerExam {
	public static void main(String[] args) {
		//쿨래스 메소드에서 배열을 직접 넣어도되고, 
		//클래스 매소드에서 ... 으로 넣어도 쉽게 가능하다.  
		Computer myCom = new Computer();
		int[] valses1 = {1, 2, 3};
	
		int result1 = myCom.sum1(valses1);
		System.out.println(result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5,6});
		System.out.println(result2);
		
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println(result3);
		
		int result4 = myCom.sum2(1,2,3,4,5,6);
		System.out.println(result4);
		
		
		
	}
}
