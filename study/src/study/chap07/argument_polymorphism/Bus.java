package study.chap07.argument_polymorphism;

public class Bus extends Vehicle {
	//부모의 메소드 run()을 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
