package study.chap06.static_block;

public class Car {
	//정적 필드
	public static int field1 = 20;		//변수 선언과 함께 초기화
	static int field2;			//쵝화하지 않음
	
	//인스턴스 필드 : 객체 생성후 메모리에 저장공간이 할당이 된다음에 사용 필드
	int seatNum;
	int TireNum;
	int speed;
	
	
	static {		//정적 블럭 ('{'로 시작해서 '}'로 끝나는 부분  ->static{} : 정적 블럭
		field2 = 30;		//초기화 수행 : 정적 필드만
//		seatMum = 4;		//사용 불가 -> 객체 생성후
		
	}
	
	//정적 메소드
	static void method() {
		//사용할수 있는 필드 : 정적 필드만 사용 가능
		field1 = 30;
		method2();
	}
	
	//인스턴스 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	static void method2() {
		System.out.println("정적 메소드2가 물림");
	}
	
}
