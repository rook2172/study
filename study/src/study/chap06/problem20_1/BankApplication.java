package study.chap06.problem20_1;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_ACCOUNT = 100;

	// ���������� �����ϴ� �ʵ� : �迭
	static Account accountArray[];
	static int count = 0;
//	static BankApplication ba;
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		accountArray = new Account[MAX_ACCOUNT];
		boolean run = true;
		while(run) {			//�޴��� �Է¹޾Ƽ� ó���ϴ� �κ�
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� : 2.���¸�� : 3.���� : 4.��� : 5.����");
			System.out.println("---------------------------------------");
			System.out.println("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;				//�ݺ��� Ż���ϴ� ���
			}else if(selectNo == 6) {
				retrieveAccount();
			}
			
		}
		System.out.println("���α׷� ����");
	}

	public static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("������: ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();
//		Account account = new Account(ano, owner, balance);
//		accountArray[count] = account;
//		count++;
		accountArray[count++] = new Account(ano, owner, balance);		//���� 3���� ���ٷ� ǥ��
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		
	}
	
	//������
	public static void accountList() {
		System.out.println("---------------------------------------");
		System.out.println("���¸��");
		System.out.println("---------------------------------------");
		
		for(int i=0;i<count;i++) {			
//			System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			Account account = accountArray[i];
			System.out.println(account.getAno()+"\t"+account.getOwner()+"\t"+account.getBalance());
		}
		
		
	}
	
	//�������
	private static void deposit() {
		System.out.println("---------------------------------------");
		System.out.println("����");
		System.out.println("---------------------------------------");
		
		//���¹�ȣ, ���ݾ�, ��� ���
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("���ݾ�: ");
		int deposit = scanner.nextInt();	
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���� ���� �����ϼ���");
		}else {
			//1.���
//			account.addBalance(deposit);
			//2���
			int balance = account.getBalance();
			account.setBalance(balance+deposit);
			System.out.println("������ �����Ͽ����ϴ�.");
		}
	}
	
	//�Ű����� : ano(���¹�ȣ)
	//��ȯ�� : ���������� ������ Account ��ü(ano, owner, balance)
	//���� : �Ű������� ���޵� ���¹�ȣ�� ���� ���¸� �˻��ؼ� ��ȯ
	public static Account findAccount(String ano) {
		for(int i=0;i<count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];			//ã��
			}
		}
		return null;			//��ã��
	}

	//���
	private static void withdraw() {
		System.out.println("---------------------------------------");
		System.out.println("���");
		System.out.println("---------------------------------------");
		
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		System.out.print("��ݾ�: ");
		int withdraw = scanner.nextInt();	
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���� ���� �����ϼ���");
		}else {
			int balance = account.getBalance();
			if(balance < withdraw) {
				System.out.println("�ܰ� �����մϴ�.");				
			}else {
				account.setBalance(balance-withdraw);
				System.out.println("���: ����� �����Ͽ����ϴ�.");
			}
		}
	}
	//�ܾ���ȸ
	private static void retrieveAccount() {
		System.out.println("---------------------------------------");
		System.out.println("�ܾ���ȸ");
		System.out.println("---------------------------------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("���� ���� �����ϼ���");
		}else {
			System.out.println(account.getAno()+"\t"+account.getOwner()+"\t"+account.getBalance());
		}
	}
}
