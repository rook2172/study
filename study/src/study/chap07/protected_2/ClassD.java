package study.chap07.protected_2;

import study.chap07.protected_1.Car;

public class ClassD extends Car {
	public void method() {	
		f1 = 10;			//public�� ����
		f2 = 10;			//protected
		f3 = "���ڿ�";		//default
		f4 = 10;			//private
	}
}
