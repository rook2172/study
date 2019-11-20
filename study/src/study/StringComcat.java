package study;

//concatenation : 연결(뒤에 계속 추가)
//문자열과 숫자가 더해지면 문자열에 추가 되어 숫자도 문자열이 된다.
public class StringComcat {

	public static void main(String[] args) {
		String str = "JDK" + 6.0;	//"JDK6.0"
				//"JDK" + "6.0" = "JDK6.0"
		System.out.println(str);
		String str2 = "JDK" + 3 + 3.3;	//"JDK3" + 3.3 = "JDK33.3"
		System.out.println(str2);
		String str3 = 6 + 3.2 + "JDK"; 	//"9.2JDK"(숫자의 더하기가 이루어진 후 + 문자열 Concat가 발생)
		System.out.println(str3);

	}

}
