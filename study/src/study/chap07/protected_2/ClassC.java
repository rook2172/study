package study.chap07.protected_2;

import study.chap07.protected_1.Car;

public class ClassC {
	public void method() {
		Car car1 = new Car();
		car1.f1 = 10;			//public�� ����
		car1.f2 = 10;			//protected
		car1.f3 = "���ڿ�";		//default
		car1.f4 = 10;			//private
	}
}
