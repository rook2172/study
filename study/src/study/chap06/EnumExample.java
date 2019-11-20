package study.chap06;

import java.util.Calendar;
import java.util.Scanner;

public class EnumExample {

	private static final int date = 0;

	public static void main(String[] args) {
		Week now = Week.MONDAY;	//��ü
		//�ð�
		Calendar cur = Calendar.getInstance();		//����ð� 
		int year = cur.get(Calendar.YEAR);			//Calendar.YEAR : enum��
		System.out.println("�⵵: "+year);
		int month = cur.get(Calendar.MONTH);		//0~11->1~12:+1
		@SuppressWarnings("unused")
		int data = cur.get(Calendar.DATE);
		System.out.println(year+"��"+(month+1)+"��"+date+"��");
		cur.add(Calendar.YEAR,1);		//2020/11/11
		cur.set(2020, 10,11);
		System.out.println("2020/11/11: "+cur.get(Calendar.DAY_OF_WEEK));
		if(now == Week.MONDAY) {
			System.out.println("������ �Դϴ�.");
		}else if(now == Week.TUESDAY) {
			System.out.println("ȭ���� �Դϴ�.");
		}
		System.out.println(now);
		
		//compateTo();
		int diff = now.compareTo(Week.FRIDAY);		//Week.MONDAY - Week.FRIDAY = 0 - 4 = -4
		System.out.println(diff);
		
		//valueOf	���ڿ��� �Է� �޾Ƽ� Enum Ÿ������ ��ȯ : "MONDAY"->Week.MONDAY		
		Scanner scanner = new Scanner(System.in);
//		String week = scanner.next();
//		Week w1 = Week.valueOf(week);		//���ڿ��� -> Enum ��ü�� ��ȯ
		int num = 12;
		String str = String.valueOf(num);		//int->String
		System.out.println(str);
		int str1 = 13;
		Integer num1 = Integer.valueOf(str1);	//String -> int(Integer)
		Week arr[] = Week.values();		//MONDAY~SUNDAY :�迭�� ũ�� 7 ������ �ҷ��´�.
		for(Week a:arr) {
			System.out.println(a);
		}
	}

}
