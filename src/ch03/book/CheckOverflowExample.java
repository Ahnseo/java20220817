package ch03.book;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(10_0000_0000, 10_0000_0000);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확히 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right) { // safeAdd : left20억 , right:20억
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left + right; // 결과는 이것인데, 오버플로우 방지 코드임
		
		
	}
}
