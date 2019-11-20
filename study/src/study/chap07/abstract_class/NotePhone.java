package study.chap07.abstract_class;

public class NotePhone extends Phone {
	//생성자
	public NotePhone(String owner) {
		super(owner);
	}
	
	//메소드
	public void internetSearch(String url) {
		System.out.println(url +"을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	public void sendMessage(String message) {
		System.out.println(message +"을 전송ㅂ합니다.");
	}
	
	

}
