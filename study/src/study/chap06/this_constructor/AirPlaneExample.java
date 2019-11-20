package study.chap06.this_constructor;

import study.chap06.class_review.AirPlane;

//프로그램을 실행하려면 mIn() 메소드가 있는 클래스가 있어야 함.
public class AirPlaneExample {

	//프로그램이 실행되면 main() 이 수행된
	public static void main(String[] args) {
		AirPlane a1 = new AirPlane();
		AirPlane a2 = new AirPlane("보잉");
		AirPlane a3 = new AirPlane(900, "록키드");
		a3.height = 10000;
		a2.speed = 500;
		System.out.println("제조사: "+a1.company);
		
	}

}
