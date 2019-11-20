package study.chap07.field_polymorphism;

public class Tire {
	public int maxRotation;		//수명
	public int accumulatedRotation;		//누적회전수
	public String location;		//장작 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {		//Tire 가 굴러가는 기능
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : "+ (maxRotation-accumulatedRotation));
			return true;
		}else {
			System.out.println("*** "+ location + "타이어 펑크***");
			return false;
		}
	}
}
