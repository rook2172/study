package study.chap06.getter;

public class BusinessMember extends Member {
	//부모가 정의한 필드, 생성자, 메소드도 조재하고 사용가능
	
	//Override : 재정의 부모가 정의한 메소드를 나만의 방법으로 재정의
	@Override		//'@' Annotation(어노테이션)
	public String setId(String id) {
		// TODO Auto-generated method stub
		return super.setId(id);
	}

}
