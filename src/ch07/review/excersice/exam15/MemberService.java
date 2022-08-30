package ch07.review.excersice.exam15;

public class MemberService {
	String id;
	Stirng password;
	
//	public MemberService(String id, Stirng password) {
//		this.id = id;
//		this.password = password;
//	}
//	
	//메소드 선언 (default)
	boolean login() {
		System.out.println("로그인 되었습니다.");
		return true;
	}
	boolean logout() {
		System.out.println("로그아웃 되었습니다.");
		return true;
	}
}
