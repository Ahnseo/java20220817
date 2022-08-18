package ch03.book;

public class IncreaseDecreaseOperatorExample {
		public static void main(String[] args) {
		//자바책 71p
		//증감 연산자
			
		int x = 10;
		int y= 10;
		int z;
		
		System.out.println("----------");
		
		x++;  // 10대입 ->11 저장
		++x; // 12대입 ->12저장 
		System.out.println("x=" + x);
		System.out.println("----------");
		
		y--;
		--y; 
		System.out.println("y="+ y); //8
		System.out.println("----------");
		
		z = x++;
		System.out.println("z=" + z); //12
		System.out.println("x=" + x); //13
		
		z= ++x;
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14
		System.out.println("----------");
		
		z= ++x + y++;
		System.out.println("z=" + z); //15 + 8 = 23
		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9
		
		
		
		
		
		
		
		
		
		}
}
