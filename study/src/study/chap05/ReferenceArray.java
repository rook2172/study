package study.chap05;

public class ReferenceArray {

	public static void main(String[] args) {
		//String 객체의 참조변수를 저장하는 배열을 5개 생성
		String arr[] = new String[5];
		//arr[i] : String 객체의 주소를 저쟝해야 함
		
		arr[0] = "홍길동";
		arr[1] = "자바";
		arr[2] = new String("백두산");
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
	}

}
