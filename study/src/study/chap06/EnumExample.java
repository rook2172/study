package study.chap06;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	private static final int date = 0;

	public static void main(String[] args) {
		Week now = Week.MONDAY;	//객체
		//시간
		Calendar cur = Calendar.getInstance();		//현재시간 
		int year = cur.get(Calendar.YEAR);			//Calendar.YEAR : enum을
		System.out.println("년도: "+year);
		int month = cur.get(Calendar.MONTH);		//0~11->1~12:+1
		@SuppressWarnings("unused")
		int data = cur.get(Calendar.DATE);
		System.out.println(year+"년"+(month+1)+"월"+date+"일");
		cur.add(Calendar.YEAR,1);		//2020/11/11
		cur.set(2020, 10,11);
		System.out.println("2020/11/11: "+cur.get(Calendar.DAY_OF_WEEK));
		if(now == Week.MONDAY) {
			System.out.println("월요일 입니다.");
		}else if(now == Week.TUESDAY) {
			System.out.println("화요일 입니다.");
		}
		System.out.println(now);
		
		//compateTo();
		int diff = now.compareTo(Week.FRIDAY);		//Week.MONDAY - Week.FRIDAY = 0 - 4 = -4
		System.out.println(diff);
		
		//valueOf	문자열을 입력 받아서 Enum 타입으로 변환 : "MONDAY"->Week.MONDAY		
		Scanner scanner = new Scanner(System.in);
//		String week = scanner.next();
//		Week w1 = Week.valueOf(week);		//문자열을 -> Enum 객체로 변환
		int num = 12;
		String str = String.valueOf(num);		//int->String
		System.out.println(str);
		int str1 = 13;
		Integer num1 = Integer.valueOf(str1);	//String -> int(Integer)
		Week arr[] = Week.values();		//MONDAY~SUNDAY :배열의 크기 7 전부을 불러온다.
		for(Week a:arr) {
			System.out.println(a);
		}
	}

}
