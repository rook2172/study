package study.chap04;

public class Exercuse04 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		System.out.println();
		
		while(i+j !=5) {
			i=rand();
			j=rand();
			System.out.println("("+i+","+j+")");
		}
	}
		private static int rand() {
			return (int)( Math.random() * 6 + 1);	//1~6			
	}
}
