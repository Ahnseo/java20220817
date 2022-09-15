package ch15컬렉션프레임워크.book.s150301p739;

public class Member {
	public String name;
	public int age;
	
	public Member(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//equals()와 hashCode()오버라이딩 하는 이유
			//인스턴스가 달라도 데이터가 동일하다면, 동일객체로 간주하고있으니.
			// 중복저장되지 않도록 하기 위함.
	
	//name 과 age 같으면, 동일한  hashCode 리턴
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//name 과 age 같으면, true 리턴
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
