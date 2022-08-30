package ch06.book.excercise.exam15;

public class MemberService {
	//작성위치

	//메소드
	public boolean login(String id, String password) {
		
		//기본값 false , 로그인 되면, 안되니까.
		return id.equals("hong") && password.equals("12345");
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}	
}
