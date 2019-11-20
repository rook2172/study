package study.chap06.problem20_1;

import java.util.Scanner;

public class BankApplication {
	private static final int MAX_ACCOUNT = 100;

	// 계좌정보를 저장하는 필드 : 배열
	static Account accountArray[];
	static int count = 0;
//	static BankApplication ba;
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		accountArray = new Account[MAX_ACCOUNT];
		boolean run = true;
		while(run) {			//메뉴를 입력받아서 처리하는 부분
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 : 2.계좌목록 : 3.예금 : 4.출금 : 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			
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
				run = false;				//반복문 탈출하는 방법
			}else if(selectNo == 6) {
				retrieveAccount();
			}
			
		}
		System.out.println("프로그램 종료");
	}

	public static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
//		Account account = new Account(ano, owner, balance);
//		accountArray[count] = account;
//		count++;
		accountArray[count++] = new Account(ano, owner, balance);		//위에 3줄을 한줄로 표시
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}
	
	//목록출력
	public static void accountList() {
		System.out.println("---------------------------------------");
		System.out.println("계좌목록");
		System.out.println("---------------------------------------");
		
		for(int i=0;i<count;i++) {			
//			System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
			Account account = accountArray[i];
			System.out.println(account.getAno()+"\t"+account.getOwner()+"\t"+account.getBalance());
		}
		
		
	}
	
	//예금출력
	private static void deposit() {
		System.out.println("---------------------------------------");
		System.out.println("예금");
		System.out.println("---------------------------------------");
		
		//계좌번호, 예금액, 결과 출력
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int deposit = scanner.nextInt();	
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌 먼저 개설하세요");
		}else {
			//1.방법
//			account.addBalance(deposit);
			//2방법
			int balance = account.getBalance();
			account.setBalance(balance+deposit);
			System.out.println("예금이 성공하였습니다.");
		}
	}
	
	//매개변수 : ano(계좌번호)
	//반환형 : 계좌정보를 저장한 Account 객체(ano, owner, balance)
	//동작 : 매개변수로 전달된 계좌번호를 가진 계좌를 검색해서 반환
	public static Account findAccount(String ano) {
		for(int i=0;i<count;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];			//찾음
			}
		}
		return null;			//못찾음
	}

	//출금
	private static void withdraw() {
		System.out.println("---------------------------------------");
		System.out.println("출금");
		System.out.println("---------------------------------------");
		
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int withdraw = scanner.nextInt();	
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌 먼저 개설하세요");
		}else {
			int balance = account.getBalance();
			if(balance < withdraw) {
				System.out.println("잔고가 부족합니다.");				
			}else {
				account.setBalance(balance-withdraw);
				System.out.println("결과: 출금이 성공하였습니다.");
			}
		}
	}
	//잔액조회
	private static void retrieveAccount() {
		System.out.println("---------------------------------------");
		System.out.println("잔액조회");
		System.out.println("---------------------------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌 먼저 개설하세요");
		}else {
			System.out.println(account.getAno()+"\t"+account.getOwner()+"\t"+account.getBalance());
		}
	}
}
