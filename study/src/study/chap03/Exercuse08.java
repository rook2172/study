package study.chap03;

public class Exercuse08 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		//double z = x % y;
		double z = x / y;	//Infinite
		
		if(Double.isNaN(z)) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		}else if(Double.isInfinite(z)) {
			System.out.println("0.0���� ���� �� �����ϴ�.");
		}else {
			double result = z + 10;
			System.out.println("���:"+result);

	}
	}
}