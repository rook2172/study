package study.chap06.method_overloadig;

public class CalculaterExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int a = 10;
		int b = 20;
		int sum = cal.add(10, 20);
		System.out.println("��: "+sum);
		double d1 = 20.0;
		double d2 = 30.0;
		System.out.println("�Ǽ� ��: "+cal.add(d1, d2));
		System.out.println();
		
		Printer myPrinter = new Printer();
		myPrinter.println(3.14);
		myPrinter.println(40);
		myPrinter.println("Hello World");
	

	}

}
