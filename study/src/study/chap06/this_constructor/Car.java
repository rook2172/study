package study.chap06.this_constructor;

public class Car {
	//필드
	String model;
	String color;
	int maxSpeed;
	
	public Car() {		//디폴트 생성자
		
	}
	
	//생성자1
	public Car(String model) {
		this(model, "white", 250);		//this : Car
//		this.model = model;
//		this.color = "White";
//		this.maxSpeed = 250;
	}
	
	//생성자2
	public Car(String model, String color) {
		this(model, color, 250);
//		Car(model, color, 250);
//		this.model = model;
//		this.color = "color";
//		this.maxSpeed = 250;
	}
	
	//생성자3
	public Car(String model, String color, int speed) {
		this.model = model;
		this.color = "color";
		this.maxSpeed = speed;
	}

}
