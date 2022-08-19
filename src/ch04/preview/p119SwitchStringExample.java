package ch04.preview;

public class p119SwitchStringExample {
	public static void main(String[] args) {
		
		//String 사용시 큰따옴표 
		String position = "과장";
		
		switch(position) {
			case "부장" :
				System.out.println("월급 700만원");
				break;
			case "과장" :
				System.out.println("월급 500만원");
				break;
			default :
				System.out.println("월급 300만원");
		}
	}
}
