package study.chap06.sitatic_member;

public class MainExample {

	public static void main(String[] args) {
		int result = Calculator.plus(10, 20);
		System.out.println("result"+result);
		System.out.println("원의 면적: "+Calculator.calculateArea(5.0));
		System.out.println("result:"+Calculator.minus(30, 20));
	}

}
