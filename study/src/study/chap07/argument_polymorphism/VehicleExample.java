package study.chap07.argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args) {
		Driver dri = new Driver();
		Vehicle vehicle = new Bus();		//�ڵ� Ÿ�Ժ�ȯ
		Bus bus = (Bus)vehicle;				//���� Ÿ�Ժ�ȯ
		dri.driver(vehicle);
//		dri.driver(new Bus());
		dri.driver(new Taxi());
		
	}

}
