package study.chap06.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();		//��ü ���� (����Ʈ �����ڸ� ���)
		System.out.println("�ӵ� : "+myCar.speed);
		//speed = 0;
		
		//��ü�� �����ϸ鼭 speed ���� �����ϰ� �ʹ�.
		Car car1 = new Car(300);
		System.out.println("�ӵ� : "+car1.speed);
		
		Car car2 = new Car(200, 5);
		System.out.println("�ӵ� :"+car2.speed);
		System.out.println("�¼���: "+car2.seat);
		
		Car cat3 = new Car(400, "�׷���", "���");		//���� �ؼ�
		Car cat4 = new Car("�ҳ�Ÿ", "��", 400);
	}

}
