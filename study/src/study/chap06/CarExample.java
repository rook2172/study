package study.chap06;

public class CarExample {
	
	//����� Ŭ���� : main() �޼ҵ尡 �ִ� Ŭ����
	public static void main(String[] args) {
		Car myCar=new Car();		//��ü �� ���� ����
		Tire myTire = new Tire();	//���� ���� : default���� ���� ��Ű������ �����Ƿ�
		Car hongCar = new Car();
		//Ŭ���� ���� : myCar, myTire, hongCar(���� ����(stack����) : �� ������ ��ü �ּ��� ���� �ִ�.)
		Car car1 = null;		//�����ϴ� ��ü�� ���� ���� null�� �ʱ�ȭ
		car1 = new Car();
	}

}
