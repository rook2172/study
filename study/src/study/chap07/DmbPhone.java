package study.chap07;
//상속
public class DmbPhone extends CellPhone {
	int channel;		//현재 사용하는 채널 정보
	//부모가 선언한 필드와 메소드를 사용가능(존재함) ->CellPhone(부모)
	public DmbPhone() {
		super("갤5","흰색");
		System.out.println("DMB폰 생성자가 호출됨");
	}
	
	public void method() {
		model = "갤8";
		powerOn();
	}
	
	public void changeChannel(int ch) {
		channel = ch;
	}
	
	public void dmb_powerOn() {
		System.out.println("DMB폰을 켭니다.");
	}
	
	public void dmb_powerOff() {
		System.out.println("DMB폰을 끕니다.");
	}
}
