package ch04.preview;

public class ch04Excercise05Review {
	public static void main(String[] args) {
		
		//4x + 5y =60 의 해를 구하고, (x,y) 로 출력
		
		for(int x = 1; x <= 10 ; x++) {
			for(int y = 1; y <= 10; y++) {
				int result = (4*x) + (5*y);
				if(result == 60) {
					System.out.println(x +","+ y);
				}
			}
		}
	}
}
