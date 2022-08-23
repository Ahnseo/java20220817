package ch04.lecture.p01control;

import java.util.Scanner; // 뭔지 모르겟지만, scanner 를 쓰기위해 넣음
						 // Scanner 클래스 호출 임.

public class C15Scanner {
	public static void main(String[] args) {
		//Scanner  userKey = new Scanner();
		//클래스명 객체이름 = new 클래스명 ();
 		
		String src ="hello my world";
		Scanner scanner = new Scanner(src);
		
		String token1 = scanner.next();  // .next(); 단어 묶음으로 
		System.out.println(token1);
		
		String token2 = scanner.next();
		System.out.println(token2);
		
		String token3 = scanner.next();
		System.out.println(token3);
		
		String src2 ="123 456 789";
		scanner = new Scanner(src2);
		
		String token4 = scanner.next();
		System.out.println(token4);
//		System.out.println(token * 4); // 안됨
		
		int i1 = Integer.valueOf(token4); //String -> int
		System.out.println(i1);
		
		System.out.println(i1 *4);
		
		int i2 = scanner.nextInt(); //456을 int로 꺼내겟다
		System.out.println(i2);
		
		
		String src3 ="hello world\nhello java\nhello spring"; // \n :new line
		System.out.println(src3);
		
		scanner = new Scanner(src3);
		String line1 = scanner.nextLine();
		System.out.println(line1);
		
		String line2 = scanner.nextLine();
		System.out.println(line2);
		
		String line3 = scanner.nextLine(); //.nextLine(); 커서 처음부터 엔터까지 
		System.out.println(line3);
		
		System.out.println("사용자 입력받기");
		
		scanner =new Scanner(System.in);   //System.in 는 키보드
		String input1 = scanner.next(); //콘솔에 글을 쓰면??
		
		System.out.println("입력한 첫번째 토큰:" + input1);
		
		int input2 = scanner.nextInt();
		System.out.println("입력한 두번째 토큰(정수):"+ input2);//콘솔에 정수를 넣으면??
		
		scanner.nextLine();
		String input3 = scanner.nextLine(); 
		System.out.println("입력한 한줄 : " + input3);
		//input3 작동하는거 맞나 ..? 
}
}
