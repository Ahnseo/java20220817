package ch15컬렉션프레임워크.lecture.p02set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C05Set {
	public static void main(String[] args) {
		//지금 배우는것은 자주일어나는 일이 아니니까 , 꼭 기억 ㄴㄴ
		
		//equals()와 hashCode()오버라이딩 하는 이유
				//인스턴스가 달라도 데이터가 동일하다면, 동일객체로 간주하고있으니.
				// 중복저장되지 않도록 하기 위함
		//equals()와 hashCode()오버라이딩 하지않는다면, Object클래스의 equals()와 hashCode() 가 적용되어
		// set 중복저장되는 현상이 발생..
		
		Set<Coffee> set = new HashSet<>();
		
		set.add(new Coffee("아메리카노"));
		System.out.println(set.add(new Coffee("라떼")));//true
		set.add(new Coffee("카푸치노"));
		System.out.println(set.add(new Coffee("라떼"))); //false
		// 결론,이퀄즈메소드를 재정의 한적없으니 ,들어감.
		
		System.out.println(set.size()); //3
		System.out.println(Arrays.deepToString(set));
	}
}

class Coffee{
	private String name;
	
	public Coffee(String name) {
		super();
		this.name = name;
	}
	
	//source > Generate > hashCode equals 자동으로 만들어줌
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coffee other = (Coffee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
