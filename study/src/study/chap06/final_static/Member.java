package study.chap06.final_static;

public class Member {
	//��) �� �������� ������ ȸ�� ������ �� : 10��(���)
	public static final int MAX_MEMBER_PER_PAGE = 10;		//���
	//�α��� ���ο� ���� ���� �з�
	public static final int LOGIN_SUCCESS = 1;
	public static final int ID_MISMATCH = 2;
	public static final int PASSWORD_MISMATCH = 3;
	public static final int NOT_EXIST = 4;
	
	String name;
	String id;
	String password;
	int age;
	int gender;
}
