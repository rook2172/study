package study.chap04;

import java.util.Scanner;

public class Exercuse07_2 {

	public static void main(String[] args) {
		boolean run = true;		
		int balance = 0;	//�ܾ�
		int menu;
		int value;		//�ݾ�
		Scanner scanner = new Scanner(System.in);

		
		
		while(run) {
			System.out.println("____________________________");
			System.out.println("1.���� : 2.��� : 3.�ܰ� : 4.����");
			System.out.println("____________________________");
			System.out.print("����> ");
			menu=scanner.nextInt();
			
			if(menu==1) {
				System.out.print("����>");
				value=scanner.nextInt();
				balance += value;				
			}else if(menu==2) {
				System.out.print("���>");
				value=scanner.nextInt();
				if(balance>value) {
					balance -= value;
				}
				
				balance -= value;
			}else if(menu==3) {
				System.out.print("�ܰ�>");
				value=scanner.nextInt();
				balance -= value;
				
			}
			System.out.println("���α׷� ����");
		}
	}
}
