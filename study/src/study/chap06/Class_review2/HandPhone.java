package study.chap06.Class_review2;
/*
 * 핸드폰 : 알람(기상),뉴스(인터넷),통화(음성),SNS(문자메시지),게임,앱(서비스제공) * 
 */
public class HandPhone {
	//구성 멤버 : 필드,생성자,메소드
	public static final int BUSY = 1;
	public static final int IDLE = 2;
	public static final int RING = 3;
	int state = IDLE;		//통화상태를 저장하는 필드
	int power;				//전원의 양
	String model;
	int dataUsage;			//데이터 사용량
	int monthlyFee;			//통신요금
	//부품 : WiFi, BT, GPS, NFC, 센서, Display, 카메라(객체)
		
	//생성자 형식 : ClassName() {}
//	HandPhone(){		//기본생성자 - 객체를 생성하면서 초기값을 넣어줄 필요성이
//	}
	
	HandPhone(String model, int fee){
		this.model = model;
		monthlyFee = fee;
	}
	
	HandPhone(int power, String model){
		this.power = power;
		this.model = model;
		
	}

	public HandPhone(int state, int power, String model, int dataUsage, int monthlyFee) {
		super();
		this.state = state;
		this.power = power;
		this.model = model;
		this.dataUsage = dataUsage;
		this.monthlyFee = monthlyFee;
	}
	
	public HandPhone(String model, int dataUsage, int monthlyFee) {
		this(IDLE, 0, model, dataUsage, monthlyFee);
	}
	
	//메소드 : 기능, 동작
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void sendMessage(String message) {
		dataUsage += message.length();
		System.out.println(message +"를 전송합니다.");
	}
	
	String reciveMessage() {
		String buffer = "문자메시지 수신 내용";
		dataUsage += buffer.length();
		power -= 1;
		return buffer;
	}
	
	void chargeBattery(int hour) {
		System.out.println("충전합니다.("+hour+")");
		power += (hour * 2);
	}
	
	void hookOff() {
		System.out.println("전화기 발신 기능을 시작");
	}
	
	void hookOn() {
		System.out.println("통화을 끊습니다.");
	}
	
}
