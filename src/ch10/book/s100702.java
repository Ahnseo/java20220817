package ch10.book;

public class s100702 {
	private long balance;
	private long money;
	
	public s100702() {
		
	}
	public long getBalance() {
		return balance;
	}
	public void deposit() {
		balance += money;
	}
	public void withdraw() throws s100701 {
		
		if(balance<money) {
			throw new s100701("잔고부족:"+(money - balance)+"모자람" );
		}
		balance -= money;
	}	
}
