package study.chap07.abstract_class;

public class SmartPhone extends Phone {
	//������
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//�޼ҵ�
	public void internetSearch(String url) {
		System.out.println(url +"�� �˻��մϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("����Ʈ���� �մϴ�.");
	}

}
