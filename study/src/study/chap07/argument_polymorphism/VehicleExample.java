package study.chap07.argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args) {
		Driver dri = new Driver();
		Vehicle vehicle = new Bus();		//자동 타입변환
		Bus bus = (Bus)vehicle;				//강제 타입변환
		dri.driver(vehicle);
//		dri.driver(new Bus());
		dri.driver(new Taxi());
		
	}

}
