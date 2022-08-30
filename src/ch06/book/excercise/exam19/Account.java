package ch06.book.excercise.exam19;

public class Account {

	private int balance;
	private int MIN_BALANCE = 0;
	private int MAX_BALANCE = 1_000_000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
