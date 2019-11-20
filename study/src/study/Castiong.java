package study;

/*
 * 타입변환 : 자동타입번환, 강제타입변환
 * 자동타입변환 : 대입, 연산
 * 큰데이터타입=작은 테이터 타입 :OK
 * 작은데이터타입=큰 데이터 타입 : 손실 발생(감안을 한다.)
 * 연산 double d = int(->double로 자동타입변화)+double
 * double d2 = int / int = int(소수점이 사라짐)
 * 			  (double 강제 타입변환)int /int(->double 자동타입변환)
 * 문자열을 다룰때
 */

public class Castiong {

	public static void main(String[] args) {
		System.out.println("문자열"+10);		//10 -> "10"(자동타입변환)
		boolean flag = true;
		System.out.println("flag = "+ flag);	//boolean ->문자열
		byte byteValue =10;
		byteValue = (byte)(byteValue + byteValue);	//byteValue = byteValue + byteValue; : x byte로 강제변환 해야한다.
		short svalue = 10;
		svalue = (short)(svalue + svalue);	//svalue = svalue + svalue; : x short로 강제변환 해야한다.
	}

}
