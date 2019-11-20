package study.chap07.abstract_class;

//�߻�Ŭ���� ---abstract : ǥ��ȭ�� Ŭ���� ����(�������� Ŭ������ ����Ư���� ����)
/*
 * Phone : ������, ��Ʈ, �׺�
 * ���� : �ε�, �߱�, �ѱ�
 * ǥ��ȭ�� Ŭ���� ���� �� (�߻� Ŭ����)
 * �𵨺���, �� ���󺰷� ��ü Ŭ������ ���� �����ϸ� ������ ȿ��ȭ
 * ��ü�� ������ �� ���� -> �߻� Ŭ������ ����� ��ü�� ���� ����
 */
public abstract class Phone {
	//�ʵ�
	public String owner;
	
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
	
	public abstract void sendMessage(String message);
}
