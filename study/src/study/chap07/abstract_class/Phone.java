package study.chap07.abstract_class;

//추상클래스 ---abstract : 표준화된 클래스 정의(여러가지 클래스의 공통특성을 정의)
/*
 * Phone : 갤럭시, 노트, 테블릿
 * 나라 : 인도, 중국, 한국
 * 표준화된 클래스 정의 후 (추상 클래스)
 * 모델별로, 각 나라별로 실체 클래스를 만들어서 개발하면 개발의 효율화
 * 객체로 생성할 수 없음 -> 추상 클래스를 상속한 객체를 생성 가능
 */
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	public abstract void sendMessage(String message);
}
