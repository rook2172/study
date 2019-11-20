package study.chap06.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();		//객체 생성 (디폴트 생성자를 사용)
		System.out.println("속도 : "+myCar.speed);
		//speed = 0;
		
		//객체를 생성하면서 speed 값을 설정하고 싶다.
		Car car1 = new Car(300);
		System.out.println("속도 : "+car1.speed);
		
		Car car2 = new Car(200, 5);
		System.out.println("속도 :"+car2.speed);
		System.out.println("좌석수: "+car2.seat);
		
		Car cat3 = new Car(400, "그랜저", "흰색");		//순서 준수
		Car cat4 = new Car("소나타", "블랙", 400);
	}

}
