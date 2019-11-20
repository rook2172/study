package study.chap06.Class_review2;
/*
 * �ڵ��� : �˶�(���),����(���ͳ�),��ȭ(����),SNS(���ڸ޽���),����,��(��������) * 
 */
public class HandPhone {
	//���� ��� : �ʵ�,������,�޼ҵ�
	public static final int BUSY = 1;
	public static final int IDLE = 2;
	public static final int RING = 3;
	int state = IDLE;		//��ȭ���¸� �����ϴ� �ʵ�
	int power;				//������ ��
	String model;
	int dataUsage;			//������ ��뷮
	int monthlyFee;			//��ſ��
	//��ǰ : WiFi, BT, GPS, NFC, ����, Display, ī�޶�(��ü)
		
	//������ ���� : ClassName() {}
//	HandPhone(){		//�⺻������ - ��ü�� �����ϸ鼭 �ʱⰪ�� �־��� �ʿ伺��
//	}
	
	HandPhone(String model, int fee){
		this.model = model;
		monthlyFee = fee;
	}
	
	HandPhone(int power, String model){
		this.power = power;
		this.model = model;
		
	}

	public HandPhone(int state, int power, String model, int dataUsage, int monthlyFee) {
		super();
		this.state = state;
		this.power = power;
		this.model = model;
		this.dataUsage = dataUsage;
		this.monthlyFee = monthlyFee;
	}
	
	public HandPhone(String model, int dataUsage, int monthlyFee) {
		this(IDLE, 0, model, dataUsage, monthlyFee);
	}
	
	//�޼ҵ� : ���, ����
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	void sendMessage(String message) {
		dataUsage += message.length();
		System.out.println(message +"�� �����մϴ�.");
	}
	
	String reciveMessage() {
		String buffer = "���ڸ޽��� ���� ����";
		dataUsage += buffer.length();
		power -= 1;
		return buffer;
	}
	
	void chargeBattery(int hour) {
		System.out.println("�����մϴ�.("+hour+")");
		power += (hour * 2);
	}
	
	void hookOff() {
		System.out.println("��ȭ�� �߽� ����� ����");
	}
	
	void hookOn() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
