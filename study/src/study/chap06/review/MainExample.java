package study.chap06.review;

public class MainExample {

	public static void main(String[] args) {
		// �ڵ��� ��ü : ��������
		Car myCar = new Car();		//������ ����  -> �������� �޸𸮰� ����
		//�ʿ信 ���Ͽ� ������ ����
		System.out.println("�ӵ�: "+myCar.speed);
		myCar.company = "���";	//��������.�ʵ�
		myCar.speedUP(60);		//��������.�޼ҵ�
		System.out.println("�ӵ�: "+myCar.speed);
		
		Car car2 = new Car("����");
		Car car3 = new Car("BMW", "520");

	}
}

//


