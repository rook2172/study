package study.chap04;

import java.util.Scanner;	//외부에서 정의된 클래스를 사용할 때 경로을 import 해 준다.

public class SwitchExample {

	public static void main(String[] args) {
		int num;
		System.out.println("정수 입력:");	//커서를 유지
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		switch(num) {
		case 1:
			System.out.println("더하기");
			break;
		case 2:
			System.out.println("빼기");
			break;
		case 3:
			System.out.println("곱하기");
			break;
		default:
			System.out.println("나누기");
			break;
			
		}
		//자바에서는 문자열도 가능
		String value;
		System.out.print("메뉴 선택");
		value = scanner.next();
		switch(value) {
		case "10":
			System.out.println("10대");
			break;
		case "20":
			System.out.println("20대");
			break;
		default:
			System.out.println("기타");
			break;
		
			
		}
	}

}
