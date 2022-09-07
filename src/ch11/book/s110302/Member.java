package ch11.book.s110302;

public class Member {
public String id;
	
	public Member(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
		
	}
	@Override
	//Object 클래스의 equals 메소드 오버라이드
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	//hashcode override
	@Override
		public int hashCode() {
			return id.hashCode();
		}
}
