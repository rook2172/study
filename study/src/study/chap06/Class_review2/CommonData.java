package study.chap06.Class_review2;
	
public class CommonData {
	//private static final int MAX_MEBER = 0;
	private static final int MAX_MEBER = 100;
	private static CommonData instance = new CommonData();
	//�̱���
	private CommonData() { }
	
	public static CommonData getInstance() {
		return instance;
	}
	//�����ϰ� ���� ������ .....
	//Member data[] = new Member[100];		//ȸ���� 100�� ����
	Member data[] = new Member[MAX_MEBER];		//ȸ���� 100�� ����
	int count = 0;		//ȸ�� ��

}
