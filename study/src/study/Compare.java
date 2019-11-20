package study;

public class Compare {

	//회원가입시 회원정보 비교시 사용
	public static void main(String[] args) {
		//String : 라이브러리(클레스)
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");  //참조변수(String str3)
		if(str1 == str2) {
			System.out.println("동일한(같은 객체) 값이다.");
		}else{
			System.out.println("다른 객체이다.");
		}
		if(str2 == str3) {
			System.out.println("동일한(같은 객체) 값이다.");
		}else{
			System.out.println("다른 객체이다.");
		}
		
		//주소를 비교, 내용 비교
		if(str1.equals(str2)) {
			System.out.println("같은 내용 입니다.");
		}else {
			System.out.println("다른 내용 입니다.");
		}
		if(str2.equals(str3)) {
			System.out.println("같은 내용 입니다.");
		}else {
			System.out.println("다른 내용 입니다.");
		}
	}

}
