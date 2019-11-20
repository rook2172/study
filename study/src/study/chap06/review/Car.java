package study.chap06.review;

//�����ִ� ��� : Car
public class Car {
	//���� ��� : 1.�ʵ�: ����(speed, seatNum), �⺻����(company, owner), ��ǰ  2.������ 3.�޼ҵ�
	int speed;
	int seatNum;
	String owner;
	String company;
	String model;
	
	//������
	//�Ļ��ڸ� ���� ���� ������ �⺻ �����ڰ� �����ϴ� ������ �����ϰ� ����
	public Car() {
		System.out.println("Car()");
	}		//���๮�� ���� : �޼ҵ��� ���� , ��ȯ���� ����, �ּҰ��� ��ȯ��
	
	
	//�������� ��Ȱ : 1. ��ü����(�޸𸮸� Ȯ��) 2. �ʵ� ���� �ʱ�ȭ
	public Car(String company, String m) {
		this.company = company;		//�Ű������� �ʵ带 �����ϱ� ���� this�� ���
		model = m;		//this�� ���� ����
	}
	
	//������ �����ε� : �����ڸ� ������ ���
	//�Ű������� Ÿ��, ����, ��ġ
//	public Car(String company,String owner) {		//��� �ȵ� : ������ ������ �����ڿ� ������ �ȵ�.
		
//	}
	
	public Car(int speed, String model){		//���
		this.speed = speed;
		this.model = model;		
	}
	
	public Car(String company) {		//company
		this(company, "�ҳ�Ÿ");		//������ ������ �����ڸ� �״�� �̿� �ϹǷ� ���� ������ ���� �� ����.
		System.out.println("Car(String company)");
	}
	
	//�żҵ�
	public void speedUP(int speed) {
		this.speed = speed;
	}
	
}
