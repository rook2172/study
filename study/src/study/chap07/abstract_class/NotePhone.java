package study.chap07.abstract_class;

public class NotePhone extends Phone {
	//������
	public NotePhone(String owner) {
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
	
	@Override
	public void sendMessage(String message) {
		System.out.println(message +"�� ���ۤ��մϴ�.");
	}
	
	

}
