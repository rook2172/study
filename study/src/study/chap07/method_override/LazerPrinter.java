package study.chap07.method_override;

public class LazerPrinter extends Printer {
	//�޼ҵ� �������̵�(Override) : �޼ҵ带 ������ <-> Overloading
	
	@Override
	public void print(String data) {
		System.out.println("�������� ����մϴ�.("+data+")");
//		super.print(data);
	}
}
