package study.chap06.problem15;

public class MemberService {

	boolean login(String id, String password) {
		//조건문 ==주소비교, equals
		if(id.equals("hong") && password.equals("12345"))
			return true;
		else
			return false;
		
	}
	
	void logout(String id) {
		System.out.println("로그 아웃 되었습니다.");
	}
}
