package ch07.review.excersice.exam15;

import java.util.Scanner;

public class MemberServiceExam15 {
	//MemberService 클래스에 login()메소드와 logout()메소드를 선언하세요.
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		boolean run = false;
		
		//입력받기
		System.out.print("id 입력>");
		String id = scanner.next();
		
		System.out.print("password 입력>");
		String password = scanner.next();
		
		if(id.equals(memberService.id) && password.equals(memberService.password)) {//t
			memberService.logout();
			run = true;
			
			
		}else if(!run){//f
			memberService.login();
		}	
	}
}