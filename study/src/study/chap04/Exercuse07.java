package study.chap04;

import java.util.Scanner;

public class Exercuse07 {

	public static void main(String[] args) {
		boolean run = true;		
		int balance = 0;		
		Scanner scanner = new Scanner(System.in);
		int menu;
		int value;
		
		
		while(run) {
			System.out.println("____________________________");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("____________________________");
			System.out.print("선택> ");			
			menu = scanner.nextInt();
			
			if(menu==1) {
				System.out.print("예금액>");
				value = scanner.nextInt();
				balance += value;
			}else if(menu==2) {
				System.out.print("출금액>");
				value = scanner.nextInt();
				//balance -= value;
				if(balance>value)
					balance -= value;
				else
					System.out.println("잔고 부족"+ balance);
			}else if(menu==3) {
				System.out.println("잔고>"+ balance);
			}else if(menu==4) {	
				run=false;
			}else {	
				System.out.println("올바른 메뉴을 입력하세요.");
				
			}
			System.out.println("프로그램 종료");
		}
	}
}
