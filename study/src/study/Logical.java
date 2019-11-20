package study;

//논리연산자 자바 : A && B, A || B, !A, A & B, A | B
//논리연산자 C언어 : !, &&, ||

public class Logical {

	public static void main(String[] args) {
		int num = 10;
		int var1 = 20;
		int a;
		int b = 10;
		
		//A && B
		//자바에서 추가된 기능 : A가 false 이면 B가 true 인지 false인지 판단 안하고 실행 안함.
		boolean flag = ((a = num) > 11) && ((b = var1) < 20);
		System.out.println("flag="+flag+",a="+a+",b="+b);
		
		//자바에서 추가된 기능 : A가 false 이더라도 B가 true 인지 false인지 판단
		flag = ((a = num) > 11) & ((b = var1) < 20);
		System.out.println("flag="+flag+",a="+a+",b="+b);			

	}

}
