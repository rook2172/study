package study.chap06.Class_review2;

import java.util.Scanner;

public class Memberexample {

	public static void main(String[] args) {
		String id;
		String name;
		String pw;
		String phone;
		String email;
		Scanner scanner = new Scanner(System.in);
		// ȸ������ : id, name, password, phone, email
		System.out.println("id: ");
		id = scanner.next();
		System.out.println("name: ");
		name = scanner.next();
		System.out.println("pw: ");
		pw = scanner.next();
		System.out.println("phone: ");
		phone = scanner.next();
		System.out.println("email: ");
		email = scanner.next();
		Member member = new Member(id, name, pw, phone, email);
		
		CommonData store = CommonData.getInstance();
		store.data[store.count] = member;
		store.count++;
		
		scanner.close();
		
		final int num = 10;		//��� : ����Ұ���
		//num = 20;		->final �������� ���� �Ұ�

	}

}
