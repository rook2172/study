package study.chap06.method_overloadig;

public class Printer {
	public void println(int data) {
		System.out.println("������ ������");
		System.out.println(data);
	}
	
	public void println(double data) {
		System.out.println("�Ǽ��� ������");
		System.out.println(data);
	}
	
	public void println(String str) {
		System.out.println("String�� ������");
		System.out.println(str);
	}

}
