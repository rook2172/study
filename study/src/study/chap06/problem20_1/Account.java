package study.chap06.problem20_1;

public class Account {
	private String ano;		//private : �ٸ� Ŭ�������� ���� ���ġ �ʰ�
	private String owner;
	private int balance;

	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//private�� ������ �����Ƿ� Getter�� Setter�� ���� ���
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
	
	//BankApplication���� �Ա�, ���
	public void setBalance(int balance) {		//���� ���� ������� �ʵ��� ����
		this.balance = balance;
	}
	
	//-------------------------------------------------------------------
	
	//������
	public void addBalance(int deposit) {
		balance += deposit;		//���� ���� �����ڸ� ����Ͽ� ������
	}
	
	//�ܰ� 
	public int subtractBalance(int withdraw) {
		if(balance > withdraw) {
			balance -= withdraw;
			return 0;			//����� �����ϸ� 0�� ��ȯ
		}else {					//�ܰ��� �� ���� ��� �Ϸ� �Ѵ�.
			return -1;
		}
	}


}
