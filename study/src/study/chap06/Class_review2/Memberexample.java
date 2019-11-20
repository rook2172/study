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
		// 회원가입 : id, name, password, phone, email
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
		
		final int num = 10;		//상수 : 변경불가능
		//num = 20;		->final 선언으로 변경 불가

	}

}
