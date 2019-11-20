package study.chap04;

import java.util.Scanner;

public class Exercuse07_2 {

	public static void main(String[] args) {
		boolean run = true;		
		int balance = 0;	//잔액
		int menu;
		int value;		//금액
		Scanner scanner = new Scanner(System.in);

		
		
		while(run) {
			System.out.println("____________________________");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("____________________________");
			System.out.print("선택> ");
			menu=scanner.nextInt();
			
			if(menu==1) {
				System.out.print("예금>");
				value=scanner.nextInt();
				balance += value;				
			}else if(menu==2) {
				System.out.print("출금>");
				value=scanner.nextInt();
				if(balance>value) {
					balance -= value;
				}
				
				balance -= value;
			}else if(menu==3) {
				System.out.print("잔고>");
				value=scanner.nextInt();
				balance -= value;
				
			}
			System.out.println("프로그램 종료");
		}
	}
}
