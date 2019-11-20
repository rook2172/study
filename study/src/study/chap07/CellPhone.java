package study.chap07;

public class CellPhone {
	//필드, 생성자, 메소드
	String model;
	String color;
	
	public CellPhone() {
		System.out.println("CellPhone() 생성자가 호출됨");
	}
	
	public CellPhone(String model, String color) {
		System.out.println("CellPhone(String model, String color) 생성자가 호출됨");
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void sendMessage(String message) {
		System.out.println(message+"전송합니다.");
	}
	
	public String receivelMessage() {
		System.out.println("메시지 수신 합니다.");
		return "수신된 메시지";
	}
}
