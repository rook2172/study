package study.chap06.problem19;

public class Account {
	private int balance;		//public, protected, defarte, private
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
//		if(!(balance<0 || balance>1000000));
		if(balance >= 0 && balance <= 1000000);
			this.balance = balance;
	}
	
	
	

}
