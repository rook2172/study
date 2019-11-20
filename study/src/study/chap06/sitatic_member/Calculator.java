package study.chap06.sitatic_member;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	static double calculateArea(double redius) {
		return pi * redius * redius;
	}

}
