package study.chap06.static_block;

public class MainExample {

	public static void main(String[] args) {
		//���� ��� : ���� ������
		Car.field1 = 20;
		Car.method2();
		
		//�ν��Ͻ� ��� : ���� ������
		Car car1 = new Car();
		car1.seatNum = 4;
		car1.setSpeed(60);

	}

}
