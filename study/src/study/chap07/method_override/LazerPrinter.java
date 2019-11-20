package study.chap07.method_override;

public class LazerPrinter extends Printer {
	//메소드 오버라이딩(Override) : 메소드를 재정의 <-> Overloading
	
	@Override
	public void print(String data) {
		System.out.println("레이저로 출력합니다.("+data+")");
//		super.print(data);
	}
}
