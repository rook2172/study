package study.chap06.problem20_1;

public class Account {
	private String ano;		//private : 다른 클래스에서 접근 허용치 않게
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//private로 접근이 어려우므로 Getter와 Setter로 접근 허용
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}
	
	//BankApplication에서 입금, 출금
	public void setBalance(int balance) {		//음의 값이 저장되지 않도록 수정
		this.balance = balance;
	}
	
	//-------------------------------------------------------------------
	
	//누적액
	public void addBalance(int deposit) {
		balance += deposit;		//복합 대입 연산자를 사용하여 누적액
	}
	
	//잔고 
	public int subtractBalance(int withdraw) {
		if(balance > withdraw) {
			balance -= withdraw;
			return 0;			//출금이 성공하면 0을 반환
		}else {					//잔고보다 더 많이 출금 하려 한다.
			return -1;
		}
	}


}
