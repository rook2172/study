package study.chap06.Class_review2;
	
public class CommonData {
	//private static final int MAX_MEBER = 0;
	private static final int MAX_MEBER = 100;
	private static CommonData instance = new CommonData();
	//싱글톤
	private CommonData() { }
	
	public static CommonData getInstance() {
		return instance;
	}
	//저장하고 싶은 데이터 .....
	//Member data[] = new Member[100];		//회원을 100명 저장
	Member data[] = new Member[MAX_MEBER];		//회원을 100명 저장
	int count = 0;		//회원 수

}
