package study.chap06.problem20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int count;

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
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
				run = false;
			}else if(selectNo == 6) {
				return;
			}
			
		}
		System.out.println("프로그램 종료");

	}
	//계좌생성하기
	private static void createAccount() {
		if(count == 100) {
			System.out.println("계좌를 개설할 수 있는 최대수를 초과 하였습니다.");
			return;
		}
//		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance= scanner.nextInt();
		accountArray[count++] = new Account(ano, owner, balance);
//		Account account = new Account(ano, owner, balance);
		System.out.println("계좌가 출력 되었습니다.");
	}
	//계좌목록보기
	private static void accountList() {
//		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i=0;i<count;i++) {
			Account account = accountArray[i];
			System.out.println(account.getAno()+"\t"+ account.getOwner()+"\t"+account.getBalance());
		}
	}
	//예금하기
	private static void deposit() {
//		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int value = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account !=null) {
			account.setBalance(value);
		}else {
			System.out.println("계좌를 먼저 생성하세요.");
		}
		accountArray[count++] = new Account(ano, owner, balance);
//		Account account = new Account(ano, owner, balance);
		System.out.println("예금이 성공 되었습니다.");
	}
	//출금하기
	private static void withdraw() {
		
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(int i=0;i<count;i++) {
			Account account = accountArray[i];
			if(account.getAno().equals(ano)) {
				return account;
			}
		}
		return null;		//ㄱㅖ좌을 찾지 못했을 때
	}
}
