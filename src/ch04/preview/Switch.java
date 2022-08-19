package ch04.preview;

public class Switch {
	public static void main(String[] args) {
		//switch (변수) {};  
		//경우의 수가 많아질수록 사용을 고려해볼만하다, if 보다 코드가 간결하다.
		//case 값,'char값', "String값" :
		//break;
		//default; 마지막
		
		
		int dice = (int)(Math.random()*6)+1;
		
		switch(dice) {
			case 1:
				System.out.println("주사위 1");
				break;
			case 2:
				System.out.println("주사위 2");
				break;
			case 3:
				System.out.println("주사위 3");
				break;	
			case 4:
				System.out.println("주사위 4");
				break;	
			case 5:
				System.out.println("주사위 5");
				break;
			default:
				System.out.println("주사위 6");
					
		};
		
	}
}
