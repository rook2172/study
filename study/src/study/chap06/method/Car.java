package study.chap06.method;

//�޼ҵ� : ��ȯ��, �Ű�����
public class Car {
	//�ʵ�
	int speed;
	int seatNum;
	String color;
	int gas;
	
	//������
	public Car() {}
	public Car(String color) {
		this.color = color;
	}
	
	//�޼ҵ�
	public void speedUP(int amount) {
		speed += amount;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void turnLeft() {
		System.out.println("��ȸ�� �մϴ�.");
		//�ڵ����� ��ȸ�� �ϴ� ����� ����
	}
	
	public void stop() {
		System.out.println("�����մϴ�.");
	}
	
	public void gas(int gas) {
		this.gas = gas;
	}
	
	public void drive() {
		gas--;
	}
	
	public int gatGas() {
		return gas;
	}

}
