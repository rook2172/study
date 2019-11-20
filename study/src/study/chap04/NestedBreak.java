package study.chap04;

public class NestedBreak {

	public static void main(String[] args) {
		Loop: for(int i = 2;i < 10;i++) {		//Label(Loop)을 써서 Label(Loop)문 전체을 벗어난다.
			for(int j = 1;j<10;j++) {
				if(i>=5 && j>5)
					break Loop;
				System.out.println(i +"*"+j+"="+(i*j));
			}
		}

	}

}
