package study.chap06.static_block;

public class Car {
	//���� �ʵ�
	public static int field1 = 20;		//���� ����� �Բ� �ʱ�ȭ
	static int field2;			//��ȭ���� ����
	
	//�ν��Ͻ� �ʵ� : ��ü ������ �޸𸮿� ��������� �Ҵ��� �ȴ����� ��� �ʵ�
	int seatNum;
	int TireNum;
	int speed;
	
	
	static {		//���� �� ('{'�� �����ؼ� '}'�� ������ �κ�  ->static{} : ���� ��
		field2 = 30;		//�ʱ�ȭ ���� : ���� �ʵ常
//		seatMum = 4;		//��� �Ұ� -> ��ü ������
		
	}
	
	//���� �޼ҵ�
	static void method() {
		//����Ҽ� �ִ� �ʵ� : ���� �ʵ常 ��� ����
		field1 = 30;
		method2();
	}
	
	//�ν��Ͻ� �޼ҵ�
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	static void method2() {
		System.out.println("���� �޼ҵ�2�� ����");
	}
	
}
