package study.chap05;

//문자열 배열 Copy

public class StringArrayCopy {

	public static void main(String[] args) {
		String str[] = {"자바", "C언어", "DBMS"};		//배열의 길이 : 3
		String more[] = new String[15];
		//복사 : 얕은(주소만 복사)
		System.arraycopy(str, 0, more, 0, str.length);
		for(int i=0;i<more.length;i++) {
			System.out.println(more[i]);
		}
		for(int i=0;i<str.length;i++) {
			if(str[i] == more[i])
				System.out.println("같은 객체를 참조");
			else
				System.out.println("다른 객체를 참조");
		}
		System.out.println("-----------------");
		//복사 : 깊은(내용 복사) -> 새로운 객체가 생김
		for(int i=0;i<str.length;i++) {
			more[i] = new String(str[i]);
		}
		for(int i=0;i<str.length;i++) {
			if(str[i] == more[i])
				System.out.println("같은 객체를 참조");
			else
				System.out.println("다른 객체를 참조");
		}

	}

}
