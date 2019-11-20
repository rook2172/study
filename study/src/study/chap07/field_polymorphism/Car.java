package study.chap07.field_polymorphism;

public class Car {
	//�ʵ�
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���", 3);
	Tire backRightTire = new Tire("�ڿ�����", 4);
	
	//������
	//�޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;		//�տ��� Ÿ�̾�
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;		//�տ����� Ÿ�̾�
		}
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(backLeftTire.roll() == false) {
			stop();
			return 3;		//�ڿ��� Ÿ�̾�
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;		//�ڿ����� Ÿ�̾�
		}
		return 0;			//���������� ��� ������ �ȴ�.
		
	}

	private void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
		
	}
}
