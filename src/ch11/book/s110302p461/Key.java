package ch11.book.s110302p461;

public class Key {
	public int hashNumber;
	
	public Key(int hashNumber) {
		this.hashNumber = hashNumber;
	}

	//이클립스 source > Generate hashCode() and equals() 클릭
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hashNumber;
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
		Key other = (Key) obj;
		if (hashNumber != other.hashNumber)
			return false;
		return true;
	}
}
