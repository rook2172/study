package study.chap07;
//���
public class DmbPhone extends CellPhone {
	int channel;		//���� ����ϴ� ä�� ����
	//�θ� ������ �ʵ�� �޼ҵ带 ��밡��(������) ->CellPhone(�θ�)
	public DmbPhone() {
		super("��5","���");
		System.out.println("DMB�� �����ڰ� ȣ���");
	}
	
	public void method() {
		model = "��8";
		powerOn();
	}
	
	public void changeChannel(int ch) {
		channel = ch;
	}
	
	public void dmb_powerOn() {
		System.out.println("DMB���� �մϴ�.");
	}
	
	public void dmb_powerOff() {
		System.out.println("DMB���� ���ϴ�.");
	}
}
