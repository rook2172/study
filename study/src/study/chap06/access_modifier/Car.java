package study.chap06.access_modifier;

public class Car {
	//필드
	public int field1;
	protected int field2;		//다른 패키지에 있는 클래스에서 접근 불가능, 예외 상속받은 클래스는 접근 가능
	int field3;					//같은 패키지내에 클래스는 접근 가능(default)
	private int field4;			//자신의 클래스내에서만 접근
	//생성자
	public Car() {}
	private Car(String value) {
		this.str = value;
	}
	
	protected Car(int value) {
		this.field1 = value;
	}
	//메소드
	public void method1() {
		System.out.println("");
	}
	protected void method2() {
		
	}
	void method3() {
		
	}
	private void method4() {
		
	}
	

}
