package study.chap06.singleton;

import java.util.Calendar;

public class MainExample {

	public static void main(String[] args) {
//		SingleTon s = new SingleTon();
		System.out.println("호출함");
		SingleTon s1 = SingleTon.getInstance();
		s1.data[0] = 10;
		System.out.println(s1.data[0]);
		
		//시간
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		CommonStorage s3 = CommonStorage.getIn();
		System.out.println(s3.data);

	}

}
