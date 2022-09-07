package ch11.lecture.p01object;

public class C05HashCodeEquals {
	public static void main(String[] args) {
		//HashCode 와 Equals 는 함께 Override 한다.
		
		
	}
}

class Phone extends Object{
	//필드 기준으로 해시코드를 만들고싶다면,
	private String modelName;
	private int code;
	private String company;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		return result;
	}
	//이클립스 source > Generate hashCode() and equals() 클릭
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (code != other.code)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}
	

	
}
