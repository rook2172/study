package study;

//Overflow : 넘친다. 표현할 수 있는 값보다 큰값을 저장하려고 할 경우
public class Overflow {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;	//int로 표현할 수 있는 최대값
		int b = Integer.MAX_VALUE;
		int sum = a + b;	//음수가 나옴(?)
		
		sum = add(a, b);

	}

	//엉뚱한 결과가 나오는 것을 피할 수 있음.
	//직접 더하지 말고 함수를 사용해서 가능한 에러(오류)를 줄여라.
	private static int add(int a, int b) {
		if(a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
			System.out.println("결과값이 넘칩니다.");
			return -1;
	}
	else
		return a+b;
	}
}
