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
			System.out.println("1.���� : 2.��� : 3.�ܰ� : 4.����");
			System.out.println("____________________________");
			System.out.print("����> ");			
			menu = scanner.nextInt();
			
			if(menu==1) {
				System.out.print("���ݾ�>");
				value = scanner.nextInt();
				balance += value;
			}else if(menu==2) {
				System.out.print("��ݾ�>");
				value = scanner.nextInt();
				//balance -= value;
				if(balance>value)
					balance -= value;
				else
					System.out.println("�ܰ� ����"+ balance);
			}else if(menu==3) {
				System.out.println("�ܰ�>"+ balance);
			}else if(menu==4) {	
				run=false;
			}else {	
				System.out.println("�ùٸ� �޴��� �Է��ϼ���.");
				
			}
			System.out.println("���α׷� ����");
		}
	}
}
