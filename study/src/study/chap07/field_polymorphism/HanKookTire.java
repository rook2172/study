package study.chap07.field_polymorphism;

public class HanKookTire extends Tire {
	//생성자 : default 생성자 -> 부모의 생성자를 호출
	public HanKookTire(String locatinon, int maxRotation) {
		super(locatinon, maxRotation);
	}
	
	
	//자식객체에서 부모의 메소드를 재정의
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HanKookTire 수명: "+ (maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("***"+ location +"HanKookTire 펑크***");
			return false;
		}
	}
	
	

}
