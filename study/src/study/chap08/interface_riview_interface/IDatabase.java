package study.chap08.interface_riview_interface;

public interface IDatabase {
	//�߻�޼ҵ�	
	void insert();
	void select();
	
	//���ο� ��� �߰� -- default
	default void update(int balance) {
		System.out.println("update() ȣ���");
	}
}
