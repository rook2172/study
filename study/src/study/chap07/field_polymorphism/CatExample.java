package study.chap07.field_polymorphism;

public class CatExample {

	public static void main(String[] args) {
		// �ڵ����� ���� -> ������ Ƚ���� ���� ->Ÿ�̾� ������ ���ؼ� ��ũ
		//�ڵ����� stop->Ÿ�̾ ��ü->��� ����
		Car car = new Car();
		for(int i = 0;i < 5;i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HanKookTire�� ��ü");
				car.frontLeftTire = new HanKookTire("�տ���",15);
				break;	
			case 2:
				System.out.println("�տ��� KumHoTire�� ��ü");
				car.frontRightTire = new HanKookTire("�տ�����",10);
				break;
			case 3:
				System.out.println("�տ��� HanKookTire�� ��ü");
				car.backLeftTire = new HanKookTire("�ڿ���",12);
				break;
			case 4:
				System.out.println("�տ��� KumHoTire�� ��ü");
				car.backRightTire = new HanKookTire("�ڿ�����",13);
				break;
			}
			System.out.println("----------------------------------");
		}

	}

}
