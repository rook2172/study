package study.chap06.problem15;

public class MemberService {

	boolean login(String id, String password) {
		//���ǹ� ==�ּҺ�, equals
		if(id.equals("hong") && password.equals("12345"))
			return true;
		else
			return false;
		
	}
	
	void logout(String id) {
		System.out.println("�α� �ƿ� �Ǿ����ϴ�.");
	}
}
