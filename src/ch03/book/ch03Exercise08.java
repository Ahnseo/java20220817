package ch03.book;

public class ch03Exercise08 {
	public static void main(String[] args) {
		double x =5.0;
		double y = 0.0;
		
		double z= x % y; //   5%0  : Not a Number;  
		
		if(Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z ;
			System.out.println("result=" + result);
		}			
	}
}
