package study.chap06.review;

//관심있는 대상 : Car
public class Car {
	//구성 멤버 : 1.필드: 상태(speed, seatNum), 기본정보(company, owner), 부품  2.생성자 3.메소드
	int speed;
	int seatNum;
	String owner;
	String company;
	String model;
	
	//생성자
	//셍상자를 정의 하지 않으면 기본 생성자가 존재하는 것으로 컴파일가 간주
	public Car() {
		System.out.println("Car()");
	}		//실행문이 없음 : 메소드의 일종 , 반환형이 없다, 주소값이 반환됨
	
	
	//생성자의 역활 : 1. 객체생성(메모리를 확보) 2. 필드 값을 초기화
	public Car(String company, String m) {
		this.company = company;		//매개변수와 필드를 구분하기 위해 this를 사용
		model = m;		//this를 생략 가능
	}
	
	//생성자 오버로딩 : 생성자를 여러개 허용
	//매개변수의 타입, 순서, 위치
//	public Car(String company,String owner) {		//허용 안됨 : 위에서 정의한 생성자와 구별이 안됨.
		
//	}
	
	public Car(int speed, String model){		//허용
		this.speed = speed;
		this.model = model;		
	}
	
	public Car(String company) {		//company
		this(company, "소나타");		//기존에 정의한 생성자를 그대로 이용 하므로 기존 갯수를 넘을 수 없다.
		System.out.println("Car(String company)");
	}
	
	//매소드
	public void speedUP(int speed) {
		this.speed = speed;
	}
	
}
