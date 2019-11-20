package study.chap06.method_overloadig;

public class Calculator {
	//산술연산
	//메소드
	public int add(int a, int b) {
		System.out.println("정수형 더하기");
		return a+b;
	}
	
	//메소드 오버로딩 : 매개변수의 타입, 순서, 위치이 다르면 다른 메소드를 허용
	public double add(double d1, double d2) {
		System.out.println("실수형 더하기");
		return d1+d2;
	}

}
